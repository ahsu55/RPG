package main.java.poison;

public class HealthPoison extends Poison{

    public HealthPoison(){
        super(10,0);
    }

    @Override
    public String toString() {
        return "Health Poison: restore "+health+ " HP";
    }
}
