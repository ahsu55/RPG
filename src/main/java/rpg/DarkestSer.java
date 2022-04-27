package main.java.rpg;

import main.java.character.Elf;
import main.java.character.GameCharacter;
import main.java.character.Human;
import main.java.character.Orc;
import main.java.classType.Archer;
import main.java.classType.Paladin;
import main.java.classType.Warrior;
import main.java.factory.CharacterFactory;
import main.java.dungeon.Battle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DarkestSer implements Runnable{

    int level =1;
    Battle battlefield;

    @Override
    public void run() {
        GameCharacter player=null;


        System.out.println("Welcome to the Darkest SER");
        try {
            player = initCharacter();
        } catch (IOException e) {
            e.printStackTrace();
        }




        System.out.println(player);
      //  player = newCharacter.makeCharacterRace();

      //  boolean alive=true;
  //      while (alive){

    //    }
    }
    public GameCharacter initCharacter() throws IOException {
        CharacterFactory newCharacter = new CharacterFactory();
        GameCharacter player = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
                if (classType.equals("a") || classType.equals("p") || classType.equals("w"))
                    classConfirm = true;
                else
                    System.out.println("Invalid input, please try again");
            }
            player= newCharacter.makeCharacterClass(classType);
            System.out.println(player);
            while (!createConfirm) {
                System.out.println("\nConfirm?Y/N");
                create = reader.readLine();
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
