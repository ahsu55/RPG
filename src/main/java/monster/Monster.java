package main.java.monster;

public abstract class Monster {
    protected int attack;
    protected int defense;
    protected int health;
    protected int exp;

    public Monster(int attack,int defense,int health,int stage){
        this.attack=attack;
        this.defense=defense;
        this.health=health;
        this.exp=getExp(stage);
    }

    public int getDefense(){
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

   // public void setStage(int stage) {
   //     this.stage = stage;
   // }
    public int getExp(int stage){
      //  int exp=0;
        int sum=0;
        for (int i=0;i<=stage;i++){
            sum+=i;
        }
        return sum*20;
    }

    @Override
    public String toString() {
        return "Monster:\n" +
                "attack=" + attack +
                "\ndefense=" + defense +
                "\nhealth=" + health+
                "\nexp=" + exp;
    }
}
