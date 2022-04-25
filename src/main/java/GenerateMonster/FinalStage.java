package main.java.GenerateMonster;

import main.java.monster.FinalBoss;
import main.java.monster.Monster;

public class FinalStage implements Stage {
     StageState state;
     int stageLevel;
     public FinalStage(StageState newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster GenerateMonster() {
          return new FinalBoss(stageLevel);
     }
}
