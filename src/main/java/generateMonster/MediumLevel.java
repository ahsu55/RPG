package main.java.generateMonster;

import main.java.monster.MediumMonster;
import main.java.monster.Monster;
import main.java.monster.RandomMonster;

public class MediumLevel implements MonsterLevel {
     Stage state;
     int stageLevel;
     public MediumLevel(Stage newStateStage){
          state=newStateStage;
          this.stageLevel=newStateStage.stageLevel;
     }
     @Override
     public Monster GenerateMonster() {
          return new MediumMonster(stageLevel, RandomMonster.RandomMonster());
     }

}
