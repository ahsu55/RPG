package main.java.equipment;

public abstract class Armor extends Equipment {
        protected String equipmentType;
        protected String equipmentName;

    public Armor(String equipmentName, String equipmentType, int attack, int defense, int health, int mana, int agi) {
        super(equipmentName,equipmentType,attack,defense,health,mana,agi);
        this.equipmentName=equipmentName;
        this.equipmentType=equipmentType;

    }

    @Override
    public String getType() {
        return equipmentType;
    }

    public String toString(){
        return getName()+": "+"Defense: "+getDefense()+"Health: "+getHealth();
    }
    public String equipment(){return "";}
    public String ability(){return "";}
}
