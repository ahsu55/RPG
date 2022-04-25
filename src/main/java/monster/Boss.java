package main.java.monster;

public class Boss extends Monster{

    public Boss(int stage) {
        super(8+stage,8+stage,3+stage*4,stage);
    }
}
