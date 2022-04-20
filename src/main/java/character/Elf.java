package main.java.character;

public class Elf extends GameCharacter{
    public Elf(String name) {
        super(8,8, 8,12,14);
        this.name=name;
        this.race="Elf";
        passiveSkill="Quickness";
        passiveSkillInfo="Gain additional 10% of the AGI";
    }
    @Override
    public String ability() {
        return "";
    }
    public String equipment(){return "";}
}
