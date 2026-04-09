package model;

public class Match {
    public void printTab(){
    for(int i = 0; i < 3; i++){
      printLab(i+1);
      for(int j = 0; j < 3; j++){
        System.out.print(" | ");
      }
      System.out.println(" | ");
    }
    printBase();
  }
  public void printLab(int i){
    if(i == 1){
      System.out.print("A");
    }else if(i == 2){
      System.out.print("B");
    }else if(i == 3){
      System.out.print("C");
    }
  }
  public void printBase(){
    System.out.println("   1  2  3");
  }
}
