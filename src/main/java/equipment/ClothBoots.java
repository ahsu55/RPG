package main.java.equipment;

public class ClothBoots extends Feet {


    public ClothBoots() {
        super("Cloth Boots","Feet", 0,2,2,0,6 );
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
        return getName()+" - "+"Defense: "+getDefense()+" Health: "+getHealth()+" Agility: "+getAgi();
    }
}
