/**

package main.java.levelUp;

import main.java.character.GameCharacter;
import main.java.classType.ClassType;

public abstract class LevelUp extends GameCharacter {
    protected GameCharacter character;
    public LevelUp(GameCharacter gameCharacter, int attack, int defense, int health, int mana, int agi) {
        super(attack,defense,health,mana,agi);
        this.character=gameCharacter;


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

    public String getName(){
        return character.getName();
    }



}
*/