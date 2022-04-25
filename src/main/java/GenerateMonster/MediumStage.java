package main.java.GenerateMonster;

import main.java.monster.MediumMonster;
import main.java.monster.Monster;

public class MediumStage implements Stage {
     StageState state;
     int stageLevel;
     public MediumStage(StageState newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster GenerateMonster() {
          return new MediumMonster(stageLevel);
     }
}
