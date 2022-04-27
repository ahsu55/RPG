package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MonsterAction implements Round{
        GameCharacter player;
        Monster monster;
    @Override
    public int RoundAction(RoundState roundState, GameCharacter player, Monster monster) throws IOException {
        int damage;
        this.player=player;
        this.monster=monster;
     //   boolean playerDead=false;
        damage = GetMonsterDamage();
        player.reduceHealth(damage);
        roundState.setState(new PlayerAction());
        if (player.getCurrentHealth()<=0)
            return 2;
        return 0;
    }

    public int GetMonsterDamage() {
        int dodge=5+player.getAgility()/10;
        Random missed = new Random();
        if (missed.nextInt(100)<dodge)
            return 0;
        else if (monster.getAttack()>player.getDefense())
            return monster.getAttack()-player.getDefense();
        else
            return 1;
    }

}

