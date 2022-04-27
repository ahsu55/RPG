package main.java.monster;

public class NormalMonster extends Monster{

    public NormalMonster(int stage,String name) {
        super(1+stage,1+stage,3+stage*2,3+stage*5,stage,name);
    }
}
