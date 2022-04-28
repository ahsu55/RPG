package main.java.monster;

public abstract class Monster {
    protected int attack;
    protected int defense;
    protected int health;
    protected int currentHealth;
    protected int agility;
    protected int exp;
    protected String name;
    protected int level;

    public Monster(int attack,int defense,int health,int agility,int stage,String name){
        this.attack=attack;
        this.defense=defense;
        this.health=health;
        this.agility=agility;
        this.exp=calculatetExp(stage);
        this.name=name;
        this.level=stage;
        this.currentHealth=health;
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

    public int getAglity() {return agility;}

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCurrentHealth(){return currentHealth;}

    public void reduceHealth(int dmg){
        currentHealth=currentHealth-dmg;
        if (dmg==0){
            System.out.println("Your attack missed");
        }
        System.out.println("You deal "+dmg+" damage to "+this.name);
    }

   // public void setStage(int stage) {
   //     this.stage = stage;
   // }
    public int calculatetExp(int stage){
      //  int exp=0;
        int sum=0;
        for (int i=0;i<=stage;i++){
            sum+=i;
        }
        return sum*20;
    }

    public int getExp(){
        return exp;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "====level "+ level +" "+name+"====\n" +
                "attack=" + attack +
                "\ndefense=" + defense +
                "\nhealth=" + getCurrentHealth()+"/"+health+
                "\nexp=" + exp;
    }
}
