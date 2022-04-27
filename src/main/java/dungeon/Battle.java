package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Battle {
    int damage;
    int heal;

    public Battle(GameCharacter player, Monster monster) throws IOException {
        boolean action=false;
        boolean vaild=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String option=getAction();
        // 1 attack, 2 skill, 3 potion
        while (!action) {
            switch (option) {
                case "1":
                    damage = GetDamage(player, monster);
                    monster.reduceHealth(damage);
                    action=true;
                    break;
                case "2":
                    //mana cost logic for different class type has not done yet
                    if (HasMana(player)) {
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
    }

    public Battle(Monster monster,GameCharacter player) {
        int option=1;
        switch (option) {
            case 1:
                damage = GetDamage(monster,player);
        }
    }


    public int GetDamage(GameCharacter player, Monster monster) {
            int dodge=5;
            Random missed = new Random();
            if (missed.nextInt(100)<dodge)
                return 0;
            else if (player.getAttack()>monster.getDefense())
                return player.getAttack()-monster.getDefense();
            else
                return 1;
   }

    public int GetDamage(Monster monster,GameCharacter player) {
        int dodge=5+player.getAgility()/10;
        Random missed = new Random();
        if (missed.nextInt(100)<dodge)
            return 0;
        else if (player.getAttack()>monster.getDefense())
            return player.getAttack()-monster.getDefense();
        else
            return 1;
    }

    public boolean HasMana(GameCharacter player){
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
        }
        return option;
    }


}

