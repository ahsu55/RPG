package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.generateMonster.Stage;
import main.java.monster.Monster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Battle {
    GameCharacter player;
    Monster monster;
    int finished=0;
    int stage;

    public Battle(GameCharacter player, int stage) throws IOException {
        this.player=player;
        this.monster=new Stage(stage).generateMonster();
        this.stage=stage;
        RoundState turn;
        System.out.println("\nFloor "+stage);
        System.out.println(monster);
        if (player.getAgility()>=monster.getAglity()){
            turn = new RoundState(new PlayerAction());
        }else{
            turn = new RoundState(new MonsterAction());
        }
        //finished 0 battle ongoing, 1 monster dead, 2 player dead
        while (finished==0){
            finished = turn.RoundAction(player,monster);
            System.out.println("Next round");
        }
        if (finished==1) {
            System.out.println("You defeated " + monster.getName());
            player.gainExp(monster.getExp());
            player.levelUp();
            this.stage=this.stage+1;
        }
        else if (finished==2) {
            this.stage=1;
            System.out.println("You are dead");
        }else if (finished==-1) {
            this.stage=-1;
            System.out.println("You are dead\n GAME OVER");
        }

        ///generate random award, get options and actions then finish the battle

    }



    public int getStage(){
        return stage;
    }


}

