package test.java;

import main.java.character.GameCharacter;
import main.java.dungeon.Battle;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.LongSword;
import main.java.factory.CharacterFactory;
import main.java.poison.HealthPoison;
import main.java.poison.ManaPoison;
import main.java.rpg.DarkestSer;
import main.java.rpg.Rpg;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.Assert.*;

//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;


//initial setup 
public class UnitTest {


    Rpg rpg;
    InputStream stdin = System.in;
    CharacterFactory characterFactory;
    GameCharacter character;
    GameCharacter character2;
    private Scanner scanner;
    DarkestSer dungeon = new DarkestSer();
    private PrintStream printStream;

    /** Set up before runtime.
     * @author ahsu5
     */
    ByteArrayInputStream inputStream1;
    ByteArrayInputStream inputStream2;
    @org.junit.Before
    public void setUp() throws Exception {

        rpg = new Rpg();
        characterFactory = new CharacterFactory();
        character = characterFactory.makeCharacterRace("Alan","h");
        character = characterFactory.makeCharacterClass("p");

        inputStream2 = new ByteArrayInputStream("1".getBytes());
    }

    // Character name:Alan, Race:Elf, Class:Archer, Skill:Focus shot, Passive skill:Quickness
    @Test
    public void character1() throws IOException {
        inputStream1 = new ByteArrayInputStream("Alan\ne\na\nY".getBytes());
        System.setIn(inputStream1);
        character = dungeon.initCharacter();
        Reader.readLine();
        System.out.println(character);
        assertEquals(character.getName(),"Alan");
        assertEquals(character.getClass().getSimpleName(),"Archer");
        assertEquals(character.getSkill(),"Focus shot");
        assertEquals(character.getPassiveSkill(),"Quickness");
    }
    // Character name:Alan, Race:Human, Class:Paladin, Skill:Heal, Passive skill:Brilliant
    @Test
    public void character2() throws IOException {
        inputStream1 = new ByteArrayInputStream("Alan\nh\np\nY".getBytes());
        System.setIn(inputStream1);
        character = dungeon.initCharacter();
        Reader.readLine();
        System.out.println(character);
        assertEquals(character.getName(),"Alan");
        assertEquals(character.getClass().getSimpleName(),"Paladin");
        assertEquals(character.getSkill(),"Heal");
        assertEquals(character.getPassiveSkill(),"Brilliant");
    }

    // Character name:Alan, Race:Orc, Class:Warrior, Skill:Berserk, Passive skill:Thick skin
    @Test
    public void character3() throws IOException {
        inputStream1 = new ByteArrayInputStream("Alan\ne\na\nN\nAlan\no\nw\nY".getBytes());
        System.setIn(inputStream1);
        character = dungeon.initCharacter();
        Reader.readLine();
        System.out.println(character);
        assertEquals(character.getName(),"Alan");
        assertEquals(character.getClass().getSimpleName(),"Warrior");
        assertEquals(character.getSkill(),"Berserk");
        assertEquals(character.getPassiveSkill(),"Thick skin");
    }


    @Test
    public void GameOver() throws IOException {

        Battle b;
        character = characterFactory.makeCharacterRace("Alan","h");
        character = characterFactory.makeCharacterClass("p");
        for (int i=1;i<50;i++){
            inputStream1 = new ByteArrayInputStream("1\n".getBytes());
            System.setIn(inputStream1);
            b = new Battle(character,i);
            Reader.readLine();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void usePosion() throws IOException {
        character = characterFactory.makeCharacterRace("Alan","h");
        character = characterFactory.makeCharacterClass("p");
        System.out.println(character.checkPoison());
        character.addPoisons(new HealthPoison());
        character.addPoisons(new ManaPoison());
        character.addPoisons(new HealthPoison());
        character.addPoisons(new ManaPoison());
        character.addPoisons(new HealthPoison());
        character.addPoisons(new ManaPoison());
        character.usePoison(6);
        character.usePoison(5);
        character.usePoison(4);
        character.usePoison(3);
        character.usePoison(2);
        character.usePoison(1);
        System.out.println(character.checkPoison());
        character.usePoison(1);



    }
    // Test player can level once has more than 300 exp, and will not level if there is not enough
    @Test
    public void levelUp() {
        character.gainExp(910);
        character.levelUp();
        assertEquals(4,character.getLevel());
        character.levelUp();
        assertEquals(4,character.getLevel());

    }

    // Test has mana will return the expected outcome
    @Test
    public void hasMana() throws IOException {
        Battle b;
        character = characterFactory.makeCharacterRace("Alan","h");
        character = characterFactory.makeCharacterClass("p");
        character.useMana(5);
        character.useMana(10);
        character.setCurrentMana(15);
        assertTrue(character.getMana()==15);


    }

    @Test
    public void GameClear() throws IOException, InterruptedException {

        Battle b;
        character = characterFactory.makeCharacterRace("Alan","h");
        character = characterFactory.makeCharacterClass("p");
        character.gainExp(90000);
        character.levelUp();
        for (int i=1;i<3;i++){
            inputStream1 = new ByteArrayInputStream("1\n1\n1\n".getBytes());
            System.setIn(inputStream1);
            b = new Battle(character,20);
            Reader.readLine();
        }


    }

    @Test
    public void Equipment() throws IOException {
        CharacterFactory characterFactory2 = new CharacterFactory();
        character2 = characterFactory2.makeCharacterRace("Alan","e");
        character2 = characterFactory2.makeCharacterClass("w");

        character2.wearEquipment(new LongSword());
        character2.wearEquipment(new ClothBoots());
        character2.wearEquipment(new ChestArmor());
        System.out.println(character2);
        assertEquals(character2.getAttack(),28);

    }







    static class Reader {
        public static String readLine() throws IOException {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            return stdin.readLine();
        }
    }

  
}