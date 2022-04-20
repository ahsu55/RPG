package main.java.equipment;

public class ChestArmor extends Armor {


    public ChestArmor() {
        super("Chest Armor","Armor", 0,5,5,0,0 );
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
        return getName()+" - "+"Defense: "+getDefense()+" Health: "+getHealth();
    }
}
