package main.java.character;
//class: fighter, mage, thief ect

//type of char: race with skill   orc, elf, dwarf, human

//Stas: Attack, Health, Mana , Defense ,cd speed ..

// Min 1 skill or magic can use
// Phy have chance for crit strike (x2 dmg)
// Attack have chance to fail  (dodge?)
// Attack deal min damage of 1

    public abstract class GameCharacter{

        protected int attack;
        protected int defense;
        protected int health;
        protected int mana;
        protected int agility;
        protected String race="";
        protected String passiveSkill;
        protected String passiveSkillInfo;
        protected String skill;
        protected String skillEffect;
        protected String name;


        public abstract String ability();

        public String bio(){

            return "Name: "+ name +"\nRace: "+race+"\n";
        }

        public String toString(){
            return "=========Bio=========\n"+bio()+"========Stats========\n"+ "Attack: "+
                    getAttack()+"\nDefense: "+getDefense()+"\nHealth: "+getHealth()+"\nMana: "+getMana()+
                    "\nAgility: "+getAgility()+"\n====Passive Skill====\n"+getPassiveSkill()+": "+getPassiveSkillInfo()+"\n";
        }

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

        public int getMana(){
            return mana;
        }

        public int getAgility(){
            return agility;
        }

        public String getSkill() {
            return skill;
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

        public String getName(){
            return name;
        }



    }
