package main.java.monster;

import java.util.ArrayList;

public class RandomMonster {
    public static String RandomMonster(){
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("Bat");
        catalog.add("Snake");
        catalog.add("Goblin");
        catalog.add("Slim");
        catalog.add("Undead");
        catalog.add("Mummy");
        catalog.add("Skeletal warrior");
        catalog.add("Gnoll");
        catalog.add("Dire bear");
        catalog.add("Golem");
        java.util.Random rand = new java.util.Random();
        return catalog.get(rand.nextInt(10));


    }
}
