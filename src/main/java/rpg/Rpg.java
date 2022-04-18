package main.java.rpg;

import main.java.character.*;
import main.java.classType.Paladin;
import main.java.classType.Warrior;


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
        GameCharacter Azshara = new Elf("Azshara");
        GameCharacter Jaina = new Human("Jaina");
        GameCharacter Thrall = new Orc("Thrall");
        GameCharacter newThrall = new Warrior(Thrall);
        GameCharacter newAzshara =new Warrior(Azshara);
        GameCharacter newJaina = new Paladin(Jaina);
       // System.out.println(Azshara.toString());
      //  System.out.println(Jaina.toString());
    //    System.out.println(Thrall.toString());
    //    System.out.println(newThrall.toString());
        System.out.println(newJaina.toString());
      
    }
}
