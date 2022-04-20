package main.java.equipment;

import main.java.character.GameCharacter;
import main.java.classType.ClassType;

public abstract class Weapon extends Equipment {
        protected String equipmentType;
        protected String equipmentName;

    public Weapon(String equipmentName, String equipmentType, int attack, int defense, int health, int mana, int agi) {
        super(equipmentName,equipmentType,attack,defense,health,mana,agi);
        this.equipmentName=equipmentName;
        this.equipmentType=equipmentType;

    }

    @Override
    public String getType() {
        return equipmentType;
    }

    public String equipment(){return "";}
    public String ability(){return "";}
}
