package main.java.classType;

import main.java.character.GameCharacter;
import main.java.equipment.Equipment;

import java.util.HashMap;

public abstract class ClassType extends GameCharacter {

    protected GameCharacter character;
    protected String skillEffect;

    public ClassType(GameCharacter gameCharacter, int attack, int defense, int health, int mana, int agi) {
        super(attack,defense,health,mana,agi);
        this.character=gameCharacter;
    }

    public String bio(){
        return character.bio()+"- Skill: "+ability()+"\n"+equipment();
    }


    public int getDefense(){
        return character.getDefense()+defense+getEquipmentDefense();
    }

    public int getAttack(){
        return character.getAttack()+attack+getEquipmentAttack();
    }

    public int getHealth(){
        return character.getHealth()+health+getEquipmentHealth();
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

    public String equipment(){
        StringBuilder eq = new StringBuilder();
        if (equiptment.size()==0){
            return "";
        }
        eq.append("=====Equipments======\n");
        if (equiptment.containsKey("Weapon")){
            eq.append(equiptment.get("Weapon").toString()+"\n");
        }
        if (equiptment.containsKey("Armor")){
            eq.append(equiptment.get("Armor").toString()+"\n");
        }
        if (equiptment.containsKey("Feet")){
            eq.append(equiptment.get("Feet").toString());
        }eq.append("\n");
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
