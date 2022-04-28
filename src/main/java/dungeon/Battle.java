package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.generateMonster.Stage;
import main.java.monster.Monster;

import java.io.IOException;

public class Battle {
    private GameCharacter player;
    protected Monster monster;
    protected int finished=0;
    protected int stage;

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
            finished = turn.roundAction(player,monster);
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
            System.out.println("You are dead");
        }

        ///generate random award, get options and actions then finish the battle

    }



    public int getStage(){
        return stage;
    }


}

