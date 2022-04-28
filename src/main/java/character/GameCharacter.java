package main.java.character;
//class: fighter, mage, thief ect

//type of char: race with skill   orc, elf, dwarf, human

//Stas: Attack, Health, Mana , Defense ,cd speed ..

// Min 1 skill or magic can use
// Phy have chance for crit strike (x2 dmg)
// Attack have chance to fail  (dodge?)
// Attack deal min damage of 1

import main.java.equipment.Equipment;
import main.java.poison.Poison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class GameCharacter{

        protected int attack;
        protected int defense;
        protected int health;
        protected int currentHealth=0;
        protected int mana;
        protected int currentMana=0;
        protected int agility;
        protected int level=1;
        protected int exp=0;
        protected String race;
        protected String classType;
        protected String passiveSkill;
        protected String passiveSkillInfo;
        protected String skill;
        protected String skillEffect;
        protected String name;
        protected LinkedList<Poison> poisons = new LinkedList<>();
        protected HashMap <String,Equipment> equiptment = new HashMap<>();



        public abstract String ability();


        public String bio(){

            return "Name : "+ name +"\nRace : "+race+"\n"+"Class: "+classType+"\n";
        }

    //    public abstract String equipment();

        public GameCharacter(int attack, int defense, int health, int mana, int agi){
            this.attack=attack;
            this.defense=defense;
            this.health=health;
            this.mana=mana;
            this.agility=agi;
        }

        public int getDefense(){
            return defense;
        }
        public int getAttack(){
            return attack;
        }
        public int getHealth(){
            return health;
        }
        public int getLevel(){
            return level;
    }
        public int getMana(){
            return mana;
        }
        public int getAgility(){
            return agility;
        }

        public String getSkill() {
            return skill;
        }

        public void wearEquipment (Equipment equipment){
            this.equiptment.put(equipment.getType(),equipment);
        }

        public String getSkillEffect(){
            return skillEffect;
        }
        public String getPassiveSkill(){
            return passiveSkill;
        }

        public String getPassiveSkillInfo(){
            return passiveSkillInfo;
        }
        public void setClass(String classType){this.classType=classType;
        }

        public void restoreAll(){

        }

        public String getName(){
            return name;
        }

        public void levelUp() {
            while (getExp()>=300) {
                if (attack / 50 == 0)
                    attack = attack + 1;
                else attack += attack / 50;
                if (defense / 50 == 0)
                    defense = defense + 1;
                else defense += defense / 50;
                if (health / 50 == 0){
                    health = health + 1;
                    if (currentHealth +1>health){
                        currentHealth=health;
                    }else
                        currentHealth=currentHealth+1;
                }
                else {
                    health += health / 50;
                    if (currentHealth+currentHealth/50>health)
                        currentHealth=health;
                    else
                        currentHealth += currentHealth /50;
                }
                if (mana / 50 == 0){
                    mana = mana + 1;
                    if (currentMana+1>mana)
                        currentMana=mana;
                    else
                        currentMana = currentMana+1;
                }
                else{
                    mana += mana / 50;
                    if (currentMana+currentMana/50>mana)
                        currentMana=mana;
                    else
                        currentMana += currentMana / 5;
                }
                if (agility / 50 == 0)
                    agility = agility + 1;
                else agility += agility / 50;
                this.level = level + 1;
                this.exp=exp-300;
                System.out.println("=======Level up!=======");
            }

        }

        public void addPoisons(Poison poison){
            poisons.add(poison);
        }
        // no error handling when select the wrong index for poison yet
        public String checkPoison() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String selection="";
            if (poisons.isEmpty()){
                System.out.println("Your bag is empty");
                selection="-1";
            }else{
                System.out.println("Select poison");
                for (int i=0;i<poisons.size();i++) {
                    System.out.println((i + 1) + ")" + poisons.get(i));
                }
                selection=reader.readLine();

            }
            return selection;
        }

        public void usePoison(int idx){

        }


        public int getCurrentHealth(){
            return currentHealth;
        }
        public int getCurrentMana(){
            return currentMana;
        }

        public void setCurrentHealth(int currentHealth) {
            this.currentHealth = currentHealth;
        }

        public void setCurrentMana(int currentMana) {
            this.currentMana = currentMana;
        }
        public int getExp(){
            return this.exp;
        }
        public void gainExp(int exp){
            this.exp=this.exp+exp;
        }

        public void useMana(int cost){}
        public void reduceHealth(int dmg){}


    public String toString(){
        return "=========Bio=========\n"+"Level: "+getLevel()+"\n"+bio()+"========Stats========\n"+ "Attack: "+
                getAttack()+"\nDefense: "+getDefense()+"\nHealth: "+getCurrentHealth()+"/"+getHealth()+"\nMana: "+getCurrentMana()+"/"+getMana()+
                "\nAgility: "+getAgility()+"\n====Passive Skill====\n"+getPassiveSkill()+": "+getPassiveSkillInfo();
    }


    public void init() {
    }
}
