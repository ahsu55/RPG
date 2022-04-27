package main.java.rpg;

import main.java.dungeon.Battle;
import main.java.equipment.LongSword;
// import main.java.levelUp.LevelUp;
import main.java.factory.CharacterFactory;
import main.java.generateMonster.Stage;
import main.java.monster.Monster;
import main.java.poison.HealthPoison;
import main.java.poison.ManaPoison;

import java.io.IOException;


public class Rpg {
    
    
    /** initial setup.
     *  
     * @return hello world
     */
    public String hello() {
        String testing = "Hello World";
        System.out.println(testing);
        return testing;
    }
    
    /**main class.
     * 
     * @param args arguments
     */
    public static void main(String[] args) throws IOException {
      //  /**
        CharacterFactory newCharacter = new CharacterFactory();
        main.java.character.GameCharacter player;
        player = newCharacter.makeCharacterRace("Jaina","h");
     //   System.out.println(player+"\n\n");
        player = newCharacter.makeCharacterClass("p");
       // System.out.println(player);
        player.wearEquipment(new LongSword());
        player.init();
        System.out.println(player);
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new ManaPoison());

        String option ;
        player.useMana(3);
        player.reduceHealth(15);
    //    option = player.checkPoison();
   //     player.usePoison(Integer.parseInt(option));
   //     option = player.checkPoison();

  //      player.usePoison(Integer.parseInt(option));
 //       option = player.checkPoison();
        //    monster = new Stage(2).generateMonster();
     //   Monster monster = new Stage(2).generateMonster();
      //  System.out.println(monster);
     //   System.out.println(player);
        Battle b = new Battle(player,2);
    //    b.PlayerAction();
    //    b = new Battle(player,3);
    //    b.PlayerAction();
  //      System.out.println(monster);
    //    player.wearEquipment(new ChestArmor());
    //    player.wearEquipment(new ClothBoots());
    //    System.out.println(player+"\n\n");
     //   player.levelUp();
     //   player.levelUp();
     //   player.levelUp();
     //   player.levelUp();
     //    */
     //   DarkestSer ser = new DarkestSer();
     //   ser.run();
      //  System.out.println(player);

    //    Monster monster;
    //    monster = new Stage(2).generateMonster();
    //    System.out.println(monster);
    //   monster = new Stage(4).generateMonster();
    //    System.out.println(monster);
    //    monster = new Stage(5).generateMonster();
    //    System.out.println(monster);
        //   HashMap <String,String> eq = new HashMap<>();
       // eq.put("Sword","Long Sword");
      //  eq.put("ars","Long Sword");
     //   for (int i=0;i<eq.size();i++){
        //   System.out.println(new LongSword().toString());
      //  }

        /**
         while (true){
         String name;

         System.out.println("Please Enter your character name:\n");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         name= reader.readLine();
         GameCharacter character = new Human(name);
         character = new Paladin(character);
         System.out.println(character.toString());

         }
         **/

    }
}
