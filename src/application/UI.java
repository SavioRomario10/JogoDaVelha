package application;

import menu.InicializacaoView;
import menu.PageInitial;

public class UI {

  public void initial(InicializacaoView pi){
    int opcao = 1;
    
    do{
    pi.exibirTitulo();
    pi.exibirMenu();
    opcao = pi.lerOpcao();
    pi.clearView();
    printMsg(opcao, pi);
    }while(opcao != 0);

  }

  public void printMsg(Integer i, InicializacaoView pi){
    if (i==1) {
      printTab();
    }
    else if (i==2) {
      ((PageInitial)pi).rules();
    }
    else{
      ((PageInitial)pi).exibirOpcaoInvalida();;
    }
  }
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