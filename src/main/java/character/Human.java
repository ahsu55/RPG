package main.java.character;

public class Human extends GameCharacter{
    public Human(String name) {
        super(10,10, 10,10,10);
        this.name=name;
        this.race="Human";
        this.passiveSkill="Brilliant";
        this.passiveSkillInfo="Gain additional 10% of the EXP";
    }
    @Override
    public String ability() {
        return "";
    }

    public String passive() {
        return "- Passive skill: "+passiveSkill+": "+passiveSkillInfo;
    }
}
