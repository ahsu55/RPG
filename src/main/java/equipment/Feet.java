package main.java.equipment;

public abstract class Feet extends Equipment {
        protected String equipmentType;
        protected String equipmentName;

    public Feet(String equipmentName, String equipmentType, int attack, int defense, int health, int mana, int agi) {
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
