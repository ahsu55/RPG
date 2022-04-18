package main.java.classType;

import main.java.character.GameCharacter;

import javax.swing.*;

public abstract class classType extends GameCharacter {

    protected GameCharacter character;
    protected String skillEffect;

    public classType(GameCharacter gameCharacter, int attack, int defense, int health, int mana, int agi) {
        super(attack,defense,health,mana,agi);
        this.character=gameCharacter;
    }

    public String bio(){
        return character.bio()+"- Skill: "+ability()+"\n";
    }

    public int getDefense(){
        return character.getDefense()+defense;
    }
    public int getAttack(){
        return character.getAttack()+attack;
    }

    public int getHealth(){
        return character.getHealth()+health;
    }

    public int getMana(){
        return character.getMana()+mana;
    }

    public int getAgility(){
        return character.getAgility()+agility;
    }

    public String getSkill() {return skill;}

    public String getSkillEffect(){
        return skillEffect;
    }

    public String getName(){
        return character.getName();
    }


}
