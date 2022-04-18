package main.java.classType;

import main.java.character.GameCharacter;

public class Warrior extends classType {


    public Warrior(GameCharacter race) {
        super(race, 10,7,8,2,3 );
        name=race.getName();
        passiveSkill=race.getPassiveSkill();
        passiveSkillInfo=race.getPassiveSkillInfo();
        skill="Berserker";
        skillEffect="Critical hit chance is increased by 3% and damage taken" +
                " is increased by 10%";
    }
    @Override
    public String ability(){
        return skill + ": "+ skillEffect;
    }
}
