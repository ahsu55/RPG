package main.java.generateMonster;

import main.java.monster.Monster;
import main.java.monster.NormalMonster;
import main.java.monster.RandomMonster;

public class NormalLevel implements MonsterLevel {
     Stage state;
     int stageLevel;
     public NormalLevel(Stage newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster generateMonster() {
          return new NormalMonster(stageLevel, RandomMonster.randomMonster());
     }
}
