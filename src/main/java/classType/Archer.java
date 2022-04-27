package main.java.classType;

import main.java.character.GameCharacter;

public class Archer extends ClassType {


    public Archer(GameCharacter race) {
        super(race, 6,5,6,5,8 );
        name=race.getName();
        setClass("Paladin");
        passiveSkill=race.getPassiveSkill();
        passiveSkillInfo=race.getPassiveSkillInfo();
        skill="Focus shot";
        skillEffect="Skip one turn and deal 300% damage";
    }
    @Override
    public String ability(){
        return "Skill: "+skill + " - "+ skillEffect;
    }
}
