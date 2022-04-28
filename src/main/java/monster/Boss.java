package main.java.monster;

public class Boss extends Monster{

    public Boss(int stage,String name) {
        super(8+stage,8+stage,3+stage*4,3+stage*5,stage,name);
    }
}
