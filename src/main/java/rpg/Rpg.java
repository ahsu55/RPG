package main.java.rpg;

import main.java.dungeon.Battle;
import main.java.equipment.ChestArmor;
import main.java.equipment.ClothBoots;
import main.java.equipment.LongSword;
// import main.java.levelUp.LevelUp;
import main.java.factory.CharacterFactory;
import main.java.generateMonster.Stage;
import main.java.monster.Monster;
import main.java.poison.HealthPoison;
import main.java.poison.ManaPoison;

import java.io.IOException;


public class Rpg {

    public static void main(String[] args) throws IOException {

        /**
         * Working wear equipment and add/use posions working
         * but not add into the logic yet
        player.wearEqipment(new LongSword());
        player.wearEquipment(new ChestArmor());
        player.wearEquipment(new ClothBoots());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new HealthPoison());
        player.addPoisons(new ManaPoison());
        */
       DarkestSer ser = new DarkestSer();
       ser.run();

    }
}
