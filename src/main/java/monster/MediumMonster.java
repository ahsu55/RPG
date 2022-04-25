package main.java.monster;

public class MediumMonster extends Monster{

    public MediumMonster(int stage) {
        super(5+stage,5+stage,3+stage*3,stage);
    }
}
