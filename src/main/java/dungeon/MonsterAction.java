package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.FinalBoss;
import main.java.monster.Monster;

import java.io.IOException;
import java.util.Random;

public class MonsterAction implements Round{
        GameCharacter player;
        Monster monster;
    @Override
    public int roundAction(RoundState roundState, GameCharacter player, Monster monster) throws IOException {
        System.out.println("Monster Type: "+monster.getClass().getSimpleName());
        if (monster.getClass().getSimpleName().equals("FinalBoss")){
            return roundAction(roundState,player,(FinalBoss) monster);
        }
        else {
            int damage;

            this.player = player;
            this.monster = monster;
            damage = getMonsterDamage();
            player.reduceHealth(damage);
            roundState.setState(new PlayerAction());
            if (player.getCurrentHealth() <= 0)
                return 2;
            return 0;
        }
    }

    public int roundAction(RoundState roundState, GameCharacter player, FinalBoss monster) throws IOException {
        int damage;
        this.player=player;
        this.monster=monster;
        damage = getMonsterDamage();
        player.reduceHealth(damage);
        roundState.setState(new PlayerAction());
        if (player.getCurrentHealth()<=0)
            return -1;
        return 0;
    }

    public int getMonsterDamage() {
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

