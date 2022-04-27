package main.java.classType;

import main.java.character.GameCharacter;
import main.java.equipment.Equipment;
import main.java.poison.Poison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public abstract class ClassType extends GameCharacter {

    protected GameCharacter character;
    protected String skillEffect;

    public ClassType(GameCharacter gameCharacter, int attack, int defense, int health, int mana, int agi) {
        super(attack,defense,health,mana,agi);
        this.character=gameCharacter;
    }

    public String bio(){
        return character.bio()+ability()+"\n"+equipment();
    }
    public void setClass(String classType) {character.setClass(classType);}

    public int getDefense(){
        return character.getDefense()+defense+getEquipmentDefense();
    }

    public int getAttack(){
        return character.getAttack()+attack+getEquipmentAttack();
    }

    public int getHealth(){
        return character.getHealth()+health+getEquipmentHealth();
    }

    public int getCurrentHealth(){
        return character.getCurrentHealth();
    }
    public int getCurrentMana(){
        return character.getCurrentMana();
    }

    public int getMana(){
        return character.getMana()+mana;
    }

    public int getAgility(){
        return character.getAgility()+agility+getEquipmentAgi();
    }

    public String getSkill() {return skill;}

    public String getSkillEffect(){
        return skillEffect;
    }

    public String getName(){
        return character.getName();
    }

    public void restoreAll(){
        restoreMana(getMana());
        restoreHealth(getHealth());
    }

    public void init(){
        character.setCurrentMana(getMana());
        character.setCurrentHealth(getHealth());
    }


    public void restoreMana(int value){
        if (character.getCurrentMana()+value<=getMana()){
            System.out.println("Your mana now restore to "+(character.getCurrentMana()+value)+"/"+getMana());
            character.setCurrentMana(currentMana+value);
        }else {
            System.out.println("Your mana now restore to "+getMana()+"/"+getMana());
            character.setCurrentMana(getMana());
        }
    }

    public void useMana(int cost){
        character.setCurrentMana(getMana()-cost);
        System.out.println("You use "+cost+" mana MP: "+character.getCurrentMana()+"/"+getMana());
    }

    public void restoreHealth(int value){
        if (character.getCurrentHealth()+value<=getHealth()){
            System.out.println("Your health now restore to "+(character.getCurrentHealth()+value)+"/"+getHealth());
            character.setCurrentHealth(currentHealth+value);
        }else {
            character.setCurrentHealth(getHealth());
            System.out.println("Your health now restore to "+getHealth()+"/"+getHealth());
        }
    }

    public void reduceHealth(int damange){
        character.setCurrentHealth(getHealth()-damange);
        System.out.println("You took "+damange+" damages HP: "+character.getCurrentHealth()+"/"+getHealth());
    }

    public void usePoison(int idx){
        if (poisons.get(idx-1).getHealth()>0)
            restoreHealth(poisons.get(idx-1).getHealth());
        if (poisons.get(idx-1).getMana()>0)
            restoreMana(poisons.get(idx-1).getMana());
        poisons.remove(idx-1);
    }



    public String equipment(){
        StringBuilder eq = new StringBuilder();
        if (equiptment.size()==0){
            return "";
        }
        eq.append("=====Equipments======\n");
        eq.append("Weapon: ");
        if (equiptment.containsKey("Weapon")){
            eq.append(equiptment.get("Weapon").toString()+"\n");
        }else
            eq.append("\n");
        eq.append("Armor : ");
        if (equiptment.containsKey("Armor")){
            eq.append(equiptment.get("Armor").toString()+"\n");
        }else
            eq.append("\n");
        eq.append("Feet  : ");
        if (equiptment.containsKey("Feet")){
            eq.append(equiptment.get("Feet").toString()+"\n");
        }else
            eq.append("\n");
        return eq.toString();

    }

    public HashMap<String, Equipment> getEquipment(){
        return this.equiptment;
    }

    public int getEquipmentAttack(){
        int total=0;
        Equipment e;
        if (equiptment.containsKey("Weapon"))
            total+=equiptment.get("Weapon").getAttack();
        return total;
    }

    public int getEquipmentDefense(){
        int total=0;
        if (equiptment.containsKey("Armor"))
            total+=equiptment.get("Armor").getDefense();
        return total;
    }

    public int getEquipmentHealth(){
        int total=0;
        if (equiptment.containsKey("Armor"))
            total+=equiptment.get("Armor").getHealth();
        if (equiptment.containsKey("Feet"))
            total+=equiptment.get("Feet").getHealth();

        return total;
    }

    public int getEquipmentMana(){
        int total=0;
        //  for (int i=0;i<equiptment.size();i++){
        //      total+=equiptment.get("Armor").getHealth();
        //  }
        return total;
    }
    public int getEquipmentAgi(){
        int total=0;
        if (equiptment.containsKey("Feet"))
            total+=equiptment.get("Feet").getAgi();
        return total;
    }

}
