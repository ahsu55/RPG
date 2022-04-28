package main.java.character;

public class Orc extends GameCharacter{
    public Orc(String name) {
        super(14,8, 6,6,6);
        this.name=name;
        this.race="Orc";
        passiveSkill="Thick skin";
        passiveSkillInfo="Gain additional 10% of the Defense";
    }

    public String ability() {
        return "";
    }

    public String passive() {
        return "- Passive skill: "+passiveSkill+": "+passiveSkillInfo;
    }
}
