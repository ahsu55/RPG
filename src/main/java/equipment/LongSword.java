package main.java.equipment;

import main.java.character.GameCharacter;

public class LongSword extends Weapon {


    public LongSword() {
        super("Long Sword","Weapon", 10,0,0,0,0 );

    }

    public String getEquipmentType (){
        return this.equipmentType;
    }

    public String getEquipmentName() {
        return equipmentName;
    }


    public String equipment(){return "";};
    public String ability(){return "";}

    public String toString(){
        return getName()+" - "+"Attack: "+getAttack();
    }
}
