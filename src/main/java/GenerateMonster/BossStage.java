package main.java.GenerateMonster;

import main.java.monster.Boss;
import main.java.monster.Monster;

public class BossStage implements Stage {
     StageState state;
     int stageLevel;
     public BossStage(StageState newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster GenerateMonster() {
          return new Boss(stageLevel);
     }
}
