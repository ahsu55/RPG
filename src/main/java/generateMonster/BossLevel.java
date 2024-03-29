package main.java.generateMonster;

import main.java.monster.Boss;
import main.java.monster.Monster;
import main.java.monster.RandomMonster;

public class BossLevel implements MonsterLevel {
     Stage state;
     int stageLevel;
     public BossLevel(Stage newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     public Monster generateMonster() {

          return new Boss(stageLevel, RandomMonster.randomMonster());
     }
}
