package main.java.GenerateMonster;

import main.java.monster.Monster;

public class StageState {
     Stage normal;
     Stage medium;
     Stage boss;
     Stage finalBoss;

     Stage currentStage;

     int stageLevel;

     public StageState(int stageLevel){
          this.stageLevel=stageLevel;
          normal = new NormalStage(this);
          medium = new MediumStage(this);
          boss = new BossStage(this);
          finalBoss = new FinalStage(this);

          if (stageLevel==20){
               currentStage=finalBoss;
          }else if (stageLevel%10==0){
               currentStage=boss;
          }else if (stageLevel%5==0){
               currentStage=medium;
          }else
               currentStage=normal;

     }

     void setCurrentStage(Stage newStage){
          currentStage=newStage;
     }
     public void setStageLevel(int level){
          stageLevel=level;
     }

     public Monster generateMonster(){
          return currentStage.GenerateMonster();
     }
}
