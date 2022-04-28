package main.java.poison;

public class ManaPoison extends Poison{

    public ManaPoison(){
        super(0,10);
    }


    @Override
    public String toString() {
        return "Mana Poison  : restore "+mana+ " MP";
    }
}
