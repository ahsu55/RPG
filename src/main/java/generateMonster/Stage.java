package main.java.generateMonster;

public class Stage {

     MonsterLevel currentMonsterLevel;

     int stageLevel;

     public Stage(int stageLevel){
          this.stageLevel=stageLevel;
     //     normal =
    //      medium =
   //       boss =
   //       finalBoss =

          if (stageLevel==20){
               currentMonsterLevel =new FinalLevel(this);;
          }else if (stageLevel%10==0){
               currentMonsterLevel =new BossLevel(this);;
          }else if (stageLevel%5==0){
               currentMonsterLevel =new MediumLevel(this);;
          }else
               currentMonsterLevel =new NormalLevel(this);;

     }

     void setCurrentStage(MonsterLevel newMonsterLevel){
          currentMonsterLevel = newMonsterLevel;
     }
     public void setStageLevel(int level){
          stageLevel=level;
     }

     public main.java.monster.Monster generateMonster(){
          return currentMonsterLevel.GenerateMonster();
     }
}
