package main.java.GenerateMonster;

import main.java.monster.Monster;
import main.java.monster.NormalMonster;

public class NormalStage implements Stage {
     StageState state;
     int stageLevel;
     public NormalStage(StageState newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster GenerateMonster() {
          return new NormalMonster(stageLevel);
     }
}
