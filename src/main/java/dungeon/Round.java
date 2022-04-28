package main.java.dungeon;

import main.java.character.GameCharacter;
import main.java.monster.Monster;

import java.io.IOException;

interface Round {
    public int roundAction(RoundState roundState, GameCharacter player, Monster monster) throws IOException;
}
