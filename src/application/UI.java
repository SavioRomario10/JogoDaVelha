package application;

import java.util.Scanner;

import menu.InicializacaoView;
import menu.PageInitial;
import model.Match;

public class UI {

  Scanner sc = new Scanner(System.in);
  Match m = new Match();

  public void initial( InicializacaoView pi){
    int opcao = 1;
    
    do{
    pi.clearView();
    pi.exibirTitulo();
    pi.exibirMenu();
    opcao = pi.lerOpcao();
    pi.clearView();
    printMsg(opcao, pi);
    }while(opcao != 0);

  }

  public void printMsg(Integer i, InicializacaoView pi){
    if (i==1) {
      m.printTab();
      sc.nextLine();
    }
    else if (i==2) {
      pi.clearView();
      pi.exibirTitulo();
      ((PageInitial)pi).rules();
      sc.nextLine();
    }
    else{
      pi.clearView();
      pi.exibirTitulo();
      pi.exibirOpcaoInvalida();
      sc.nextLine();
    }
  }
}