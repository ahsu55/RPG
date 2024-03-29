package main.java.rpg;

import main.java.character.Elf;
import main.java.character.GameCharacter;
import main.java.character.Human;
import main.java.character.Orc;
import main.java.classType.Archer;
import main.java.classType.Paladin;
import main.java.classType.Warrior;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.LongSword;
import main.java.factory.CharacterFactory;
import main.java.dungeon.Battle;
import main.java.poison.HealthPoison;
import main.java.poison.ManaPoison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class DarkestSer implements Runnable{
    
    @Override
    public void run() {
        GameCharacter player ;

        //create default player type
        CharacterFactory factory = new CharacterFactory();
        player=factory.makeCharacterRace("default","h");
        player=factory.makeCharacterClass("o");

        System.out.println("Welcome to the Darkest SER");
        try {
            player = initCharacter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(player);
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new ManaPoison());
        player.wearEquipment(new LongSword());
        player.wearEquipment(new ClothBoots());
        player.wearEquipment(new ChestArmor());
        System.out.println(player);

        Battle b = null;
        try {
            b = new Battle(player,1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Boolean gameover=false;
        while (!gameover) {
            try {
                b = new Battle(player, b.getStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (b.getStage()==21) {
                System.out.println("GAME CLEAR");
                gameover=true;
            }else if (b.getStage()==-1){
                System.out.println("GAME OVER, YOU LOSE");
                gameover=true;
            }else if (b.getStage()==1){
                player.init();
                System.out.println("Back to floor 1\n");
            }
        }
        System.out.println("Thank you for playing the game");




      //  System.out.println(player);
      //  player = newCharacter.makeCharacterRace();

      //  boolean alive=true;
  //      while (alive){

    //    }
    }
    public GameCharacter initCharacter() throws IOException {
        CharacterFactory newCharacter = new CharacterFactory();
        GameCharacter player = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String name;
        String race = null;
        String classType = null;
        String create=null;
        boolean confirm=false;
        boolean raceType=false;
        boolean classConfirm=false;
        boolean createConfirm=false;
        System.out.println("What's the name of your character?");
        name= reader.readLine();
        while (!confirm) {
            while (!raceType) {
                System.out.println("Please select your race");
                System.out.println("h)Human");
                System.out.println(new Human("").passive());
                System.out.println("o)Orc");
                System.out.println(new Orc("").passive());
                System.out.println("e)Elf");
                System.out.println(new Elf("").passive());
                race = reader.readLine();
                if (race==null)
                    race="h";
                if (race.equals("h") || race.equals("o") || race.equals("e"))
                    raceType = true;
                else
                    System.out.println("Invalid input, please try again");
            }
            player = newCharacter.makeCharacterRace(name,race);
            while (!classConfirm) {
                System.out.println("Please select your class");
                System.out.println("a)Archer");
                System.out.println(new Archer(player).ability());
                System.out.println("p)Paladin");
                System.out.println(new Paladin(player).ability());
                System.out.println("w)Warrior");
                System.out.println(new Warrior(player).ability());
                classType = reader.readLine();
                if (classType==null)
                    classType="a";
                if (classType.equals("a") || classType.equals("p") || classType.equals("w"))
                    classConfirm = true;
                else
                    System.out.println("Invalid input, please try again");
            }
            player= newCharacter.makeCharacterClass(classType);
            player.init();
            System.out.println(player);
            while (!createConfirm) {
                System.out.println("\nConfirm?Y/N");
                create = reader.readLine();
                if (create==null)
                    create="Y";
                if (create.equals("Y")) {
                    confirm = true;
                    createConfirm=true;
                }
                else if (create.equals("N")){
                    createConfirm = true;
                }
                else
                    System.out.println("Invalid input, please try again");
            }
            classConfirm = false;
            raceType=false;
            createConfirm=false;
        }

        return player;

    }
}
