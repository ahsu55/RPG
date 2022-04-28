package main.java.rpg;

import main.java.dungeon.Battle;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
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
        /**
        CharacterFactory newCharacter = new CharacterFactory();
        main.java.character.GameCharacter player;
        player = newCharacter.makeCharacterRace("Jaina","h");
        player = newCharacter.makeCharacterClass("p");
       // System.out.println(player);
        player.wearEquipment(new LongSword());
        player.wearEquipment(new ChestArmor());
        player.wearEquipment(new ClothBoots());
        player.init();
        System.out.println(player);
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new ManaPoison());



        Battle b = new Battle(player,1);
        Boolean gameover=false;
        while (!gameover) {
            b = new Battle(player, b.getStage());
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
   //     b = new Battle(player,b.getStage());
   //     b = new Battle(player,b.getStage());
   //     b = new Battle(player,b.getStage());
   //     b = new Battle(player,b.getStage());
   //     b = new Battle(player,b.getStage());

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
         */
       DarkestSer ser = new DarkestSer();
        ser.run();
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
