package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.generateMonster.Stage;
import main.java.monster.Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Battle {
    GameCharacter player;
    Monster monster;
    int finished=0;

    public Battle(GameCharacter player, int stage) throws IOException {
        this.player=player;
        this.monster=new Stage(stage).generateMonster();
        RoundState turn;
        if (player.getAgility()>=monster.getAglity()){
            turn = new RoundState(new PlayerAction());
        }else{
            turn = new RoundState(new MonsterAction());
        }
        //finished 0 battle ongoing, 1 monster dead, 2 player dead
        while (finished==0){
            finished = turn.RoundAction(player,monster);
            System.out.println("Next round");
        }
        if (finished==1)
            System.out.println("You defeated "+monster.getClass().getSimpleName());
        else if (finished==2)
            System.out.println("You are dead");

        ///generate random award, get options and actions then finish the battle

    }

    public boolean PlayerAction() throws IOException {
        boolean action=false;
        boolean monsterDead=false;
        int damage;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String option=getAction();
        // 1 attack, 2 skill, 3 potion
        while (!action) {
            switch (option) {
                case "1":
                    damage = GetPlayerDamage();
                    monster.reduceHealth(damage);
                    action=true;
                    break;
                case "2":
                    //mana cost logic for different class type has not done yet
                    if (HasMana()) {
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
                        }

                    }else {
                        System.out.println("not enough mana");
                        option=getAction();
                    }
                    break;
                case "3":
                    String idx = player.checkPoison();
                    player.usePoison(Integer.parseInt(idx));
                    action=true;
                    break;

            }
        }
        if (monster.getCurrentHealth()<=0)
            return true;
        return monsterDead;
    }
    public boolean MonsterAction() {
        int damage;
        boolean playerDead=false;
        damage = GetMondyrtDamage();
        player.reduceHealth(damage);
        if (player.getCurrentHealth()<=0)
            return true;
        return playerDead;
    }


    public int GetPlayerDamage() {
            int dodge=5;
            Random missed = new Random();
            if (missed.nextInt(100)<dodge)
                return 0;
            else if (this.player.getAttack()>this.monster.getDefense())
                return player.getAttack()-monster.getDefense();
            else
                return 1;
   }

    public int GetMondyrtDamage() {
        int dodge=5+player.getAgility()/10;
        Random missed = new Random();
        if (missed.nextInt(100)<dodge)
            return 0;
        else if (monster.getAttack()>player.getDefense())
            return monster.getAttack()-player.getDefense();
        else
            return 1;
    }

    public boolean HasMana(){
        if (player.getCurrentMana()>=5){
            return true;
        }else
            return false;
    }

    public String getAction() throws IOException {
        boolean vaild=false;
        String option="";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(!vaild) {
            System.out.println("1)Attack\n2)Skill\n3)User poison");
            option = reader.readLine();
            if (option.equals("1")||option.equals("2")||option.equals("3"))
                vaild=true;
            else System.out.println("Invalid input");
        }
        return option;
    }


}
