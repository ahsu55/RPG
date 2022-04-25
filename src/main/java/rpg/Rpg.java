package main.java.rpg;

import main.java.GenerateMonster.StageState;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.LongSword;
// import main.java.levelUp.LevelUp;
import main.java.factory.CharacterFactory;
import main.java.monster.Monster;
import main.java.monster.NormalMonster;


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
        CharacterFactory newCharacter = new CharacterFactory();
        main.java.character.GameCharacter player;
        player = newCharacter.makeCharacterRace("Jaina","h");
        System.out.println(player+"\n\n");
        player = newCharacter.makeCharacterClass("p");
  //      GameCharacter Azshara = new Elf("Azshara");
   //     GameCharacter Jaina = new Human("Jaina");
   //     GameCharacter Thrall = new Orc("Thrall");
    //    GameCharacter newThrall = new Warrior(Thrall);
     //   GameCharacter newAzshara =new Warrior(Azshara);
   //     GameCharacter newJaina = new Paladin(Jaina);
   //     Jaina = new Paladin(Jaina);
      //  Jaina = new LevelUp(Jaina);

       // System.out.println(Azshara.toString());
    //    System.out.println(Jaina.toString());
    //    System.out.println(Thrall.toString());
    //    System.out.println(newThrall.toString());
  //      System.out.println(newJaina.toString());
    //    System.out.println(Jaina.toString());
       // Jaina = new LongSword(Jaina);
    //    System.out.println(Jaina.toString());
    //    Equipment eq = new LongSword();
     //   System.out.println(eq.toString());
    //    System.out.println(Jaina.toString());
        System.out.println(player);
        player.wearEquipment(new LongSword());
    //    System.out.println(Jaina.toString());
        player.wearEquipment(new ChestArmor());
    //    System.out.println(Jaina.toString());
        player.wearEquipment(new ClothBoots());
        System.out.println(player+"\n\n");
        player.levelUp();
        player.levelUp();
        player.levelUp();
        player.levelUp();

        System.out.println(player);

        Monster monster;
        monster = new StageState(2).generateMonster();
        System.out.println(monster);
        monster = new StageState(4).generateMonster();
        System.out.println(monster);
        monster = new StageState(5).generateMonster();
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
