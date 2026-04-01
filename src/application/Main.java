package application;

import menu.InicializacaoView;
import menu.PageInitial;

public class Main {
  public static void main(String[] args) {

    int opcao = 0;
    
    InicializacaoView view = new PageInitial();

    view.exibirTitulo();
    
    do {
      view.exibirMenu();
      opcao = view.lerOpcao();

      switch (opcao) {
        case 1: System.out.println("Iniciando jogo...");
          break;
        case 2: System.out.println("Regras: alinhe 3 símbolos para vencer.");
          break;
        case 0: System.out.println("Saindo do jogo...");
          break;
        default: view.exibirOpcaoInvalida();
      }
    } while (opcao != 0);
  }
}