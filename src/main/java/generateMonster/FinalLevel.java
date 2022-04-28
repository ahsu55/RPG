package main.java.generateMonster;

import main.java.monster.FinalBoss;
import main.java.monster.Monster;
import main.java.monster.RandomMonster;

public class FinalLevel implements MonsterLevel {
     Stage state;
     int stageLevel;
     public FinalLevel(Stage newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster generateMonster() {
          return new FinalBoss(stageLevel, RandomMonster.randomMonster());
     }
}
