package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PlayerAction implements Round{
        GameCharacter player;
        Monster monster;
    @Override
    public int roundAction(RoundState roundState, GameCharacter player, Monster monster) throws IOException {
        this.player=player;
        this.monster=monster;
        boolean action=false;
        int damage;
        String option=getAction();
        // 1 attack, 2 skill, 3 potion, 4 stats
        while (!action) {
            switch (option) {
                case "1":
                    damage = getPlayerDamage();
                    monster.reduceHealth(damage);
                    action=true;
                    break;
                case "2":
                    //mana cost logic for different class type has not done yet
                    if (hasMana()) {
                        String classType=player.getClass().getSimpleName();
                        switch (classType){
                            case "Paladin":
                                System.out.println("Using "+player.getSkill());
                                player.useMana(5);
                                action=true;
                                break;
                            case "Archer":
                                System.out.println("Using "+player.getSkill());
                                player.useMana(4);
                                action=true;
                                break;
                            case "Warrior":
                                System.out.println("Using "+player.getSkill());
                                player.useMana(3);
                                action=true;
                                break;
                            default:
                                action=true;
                                break;
                        }

                    }else {
                        System.out.println("not enough mana");
                        option=getAction();
                    }
                    break;
                case "3":
                    String idx = player.checkPoison();
                    if (idx.equals("-1")){
                        System.out.println("You don't have any poisons");
                        option=getAction();
                    }else {
                        player.usePoison(Integer.parseInt(idx));
                        action = true;
                    }
                    break;
                case "4":
                    System.out.println(player);
                    option=getAction();
                    break;
                    //for testing
                case "-100":
                    player.reduceHealth(10);
                    action=true;
                    break;
                default:
                    damage = getPlayerDamage();
                    monster.reduceHealth(damage);
                    action=true;
                    break;

            }
        }
        roundState.setState(new MonsterAction());
        if (monster.getCurrentHealth()<=0)
            return 1;
        return 0;
    }


    public String getAction() throws IOException {
        boolean vaild=false;
        String option="";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            while (!vaild) {
                System.out.println("1)Attack\n2)Skill\n3)User poison\n4)Stats");
                option = reader.readLine();
                if (option==null)
                    option="-100";
                if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("-100"))
                    vaild = true;
                else System.out.println("Invalid input");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return option;
    }

    public int getPlayerDamage() {
        int dodge=5;
        Random missed = new Random();
        if (missed.nextInt(100)<dodge)
            return 0;
        else if (this.player.getAttack()>this.monster.getDefense())
            return player.getAttack()-monster.getDefense();
        else
            return 1;
    }
    public boolean hasMana(){
        if (player.getCurrentMana()>=5){
            return true;
        }else
            return false;
    }
}

