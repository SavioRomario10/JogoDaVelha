package application;

import java.util.Scanner;

import menu.InicializacaoView;
import menu.PageInitial;

public class UI {

  Scanner sc = new Scanner(System.in);
  InicializacaoView view = new PageInitial();
  public void printMenu(){

    view.exibirTitulo();
    view.exibirMenu();

    int opcao = view.lerOpcao();

    while (opcao != 0) {
      switch (opcao) {
        case 1:
          view.clearView();
          view.exibirTitulo();
          printTab();
          String jogada = play();
          opcao = view.lerOpcao();
          break;
        case 2:
          view.clearView();
          view.exibirTitulo();
          System.out.println("Regras");
          System.out.println("alinhe seus simbolos para ganhar!");
          System.out.println();
          view.exibirMenu();
          opcao = view.lerOpcao();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          view.exibirOpcaoInvalida();
      }
    }
  }

  public static void printTab(){

    System.out.println("   |   |   ");
    System.out.println("---+---+---");
    System.out.println("   |   |   ");
    System.out.println("---+---+---");
    System.out.println("   |   |   ");
  }

  public String play(){
    System.out.println("escolha sua jogada");
    return sc.next();
  }
}