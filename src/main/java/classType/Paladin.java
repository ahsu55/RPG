package main.java.classType;

import main.java.character.GameCharacter;

public class Paladin extends classType {


    public Paladin(GameCharacter race) {
        super(race, 5,9,8,5,3 );
        name=race.getName();
        passiveSkill=race.getPassiveSkill();
        passiveSkillInfo=race.getPassiveSkillInfo();
        skill="Heal";
        skillEffect="Restore 20% of the total health";
    }
    @Override
    public String ability(){
        return skill + ": "+ skillEffect;
    }
}
