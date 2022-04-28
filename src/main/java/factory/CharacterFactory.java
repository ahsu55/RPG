package main.java.factory;

import main.java.character.Elf;
import main.java.character.GameCharacter;
import main.java.character.Human;
import main.java.character.Orc;
import main.java.classType.Archer;
import main.java.classType.Paladin;
import main.java.classType.Warrior;

public class CharacterFactory {

    GameCharacter newCharacter = null;

    public GameCharacter makeCharacterRace(String name, String race){
        switch (race) {
            case "e":
                newCharacter = new Elf(name);
                break;
            case "h":
                newCharacter = new Human(name);
                break;
            case "o":
                newCharacter = new Orc(name);
                break;
        }
        return newCharacter;
    }
    public GameCharacter makeCharacterClass(String charClass) {
        switch (charClass) {
            case "a":
                return newCharacter = new Archer(newCharacter);
            case "p":
                return newCharacter = new Paladin(newCharacter);
            case "w":
                return newCharacter = new Warrior(newCharacter);
        }
        return null;
    }

}
