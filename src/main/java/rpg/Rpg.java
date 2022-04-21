package main.java.rpg;

import main.java.character.*;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.Equipment;
import main.java.equipment.LongSword;
// import main.java.levelUp.LevelUp;
import main.java.classType.Paladin;
import main.java.classType.Warrior;

import java.util.HashMap;


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
  //      GameCharacter Azshara = new Elf("Azshara");
        GameCharacter Jaina = new Human("Jaina");
   //     GameCharacter Thrall = new Orc("Thrall");
    //    GameCharacter newThrall = new Warrior(Thrall);
     //   GameCharacter newAzshara =new Warrior(Azshara);
   //     GameCharacter newJaina = new Paladin(Jaina);
        Jaina = new Paladin(Jaina);
      //  Jaina = new LevelUp(Jaina);

       // System.out.println(Azshara.toString());
    //    System.out.println(Jaina.toString());
    //    System.out.println(Thrall.toString());
    //    System.out.println(newThrall.toString());
  //      System.out.println(newJaina.toString());
    //    System.out.println(Jaina.toString());
       // Jaina = new LongSword(Jaina);
    //    System.out.println(Jaina.toString());
        Equipment eq = new LongSword();
     //   System.out.println(eq.toString());
    //    System.out.println(Jaina.toString());
        Jaina.wearEquipment(new LongSword());
    //    System.out.println(Jaina.toString());
        Jaina.wearEquipment(new ChestArmor());
    //    System.out.println(Jaina.toString());
        Jaina.wearEquipment(new ClothBoots());
        System.out.println(Jaina);
        Jaina.levelUp();
        Jaina.levelUp();
        Jaina.levelUp();
        Jaina.levelUp();

        System.out.println(Jaina);

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
