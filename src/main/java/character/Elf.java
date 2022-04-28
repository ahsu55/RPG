package main.java.character;

/**
 * Create an Elf race character.
 */
public class Elf extends GameCharacter {
    /**
     * Create Elf race character with name and Elf type stats.
     * @param name Character name
     */
    public Elf(String name) {
        super(8,8, 8,12,14);

        this.name = name;
        this.race = "Elf";
        passiveSkill = "Quickness";
        passiveSkillInfo = "Gain additional 10% of the AGI";
    }

    public String ability() {
        return "";
    }

    public String passive() {
        return "- Passive skill: " + passiveSkill + ": " + passiveSkillInfo;
    }
}
