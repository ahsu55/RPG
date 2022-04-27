package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.Monster;

import java.io.IOException;

public class RoundState {
    private Round round;
    RoundState(Round turn){
        setState(turn);
    }

    void setState(Round newRound){
        round=newRound;
    }

    public int RoundAction(GameCharacter player, Monster monster) throws IOException {
        return round.RoundAction(this,player, monster);

    }
}
