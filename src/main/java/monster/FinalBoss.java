package main.java.monster;

public class FinalBoss extends Monster{

    public FinalBoss(int stage,String name) {
        super(15+stage,15+stage,15+stage*5,stage,name);
    }
}
