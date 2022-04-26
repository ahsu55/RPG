package main.java.rpg;

import main.java.GenerateMonster.Stage;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.LongSword;
// import main.java.levelUp.LevelUp;
import main.java.factory.CharacterFactory;
import main.java.monster.Monster;


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
    public static void main(String[] args) {
        /**
        CharacterFactory newCharacter = new CharacterFactory();
        main.java.character.GameCharacter player;
        player = newCharacter.makeCharacterRace("Jaina","h");
        System.out.println(player+"\n\n");
        player = newCharacter.makeCharacterClass("p");
        System.out.println(player);
        player.wearEquipment(new LongSword());
        player.wearEquipment(new ChestArmor());
        player.wearEquipment(new ClothBoots());
        System.out.println(player+"\n\n");
        player.levelUp();
        player.levelUp();
        player.levelUp();
        player.levelUp();
         */
        DarkestSer ser = new DarkestSer();
        ser.run();
      //  System.out.println(player);

        Monster monster;
        monster = new Stage(2).generateMonster();
        System.out.println(monster);
       monster = new Stage(4).generateMonster();
        System.out.println(monster);
        monster = new Stage(5).generateMonster();
        System.out.println(monster);
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
