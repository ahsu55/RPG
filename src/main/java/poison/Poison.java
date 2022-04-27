package main.java.poison;

public abstract class Poison {
    int health;
    int mana;
    Poison(int health,int mana){
        this.health=health;
        this.mana=mana;
    }

    public int getHealth(){
        return health;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Poison{" +
                "health=" + health +
                ", mana=" + mana +
                '}';
    }
}
