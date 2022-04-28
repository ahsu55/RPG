package main.java.equipment;

import main.java.character.GameCharacter;
import main.java.classType.ClassType;

public abstract class Equipment {

  //  protected String equipmentType;
  //  protected String equipmentName;
    protected String name;
    protected String type;
    protected int attack;
    protected int defense;
    protected int health;
    protected int mana;
    protected int agi;

    public Equipment(String name, String type, int attack, int defense, int health, int mana, int agi) {
        this.name=name;
        this.type=type;
        this.attack=attack;
        this.defense=defense;
        this.health=health;
        this.mana=mana;
        this.agi=agi;
    }

    public int getAgi() {
        return agi;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();


    public String toString(){
        return getName()+": "+"Defense: "+getDefense()+"Health: "+getHealth();
     //   return "==="+getName()+"===\n"+"Attack: "+
     //           getAttack()+"\nDefense: "+getDefense()+"\nHealth: "+getHealth()+"\nMana: "+getMana()+
     //           "\nAgility: "+getAgi();
    }
    //  public String getEquipmentName() {
  //      return equipmentName;
  //  }

 //   public String getEquipmentType(){
  //      return equipmentType;
  //  }
}
