package menu;

import java.util.Scanner;

public class PageInitial implements InicializacaoView{

  private final Scanner scanner= new Scanner(System.in);

  @Override
  public void exibirTitulo() {
    System.out.println("=================================");
    System.out.println("        JOGO DA VELHA");
    System.out.println("================================");
  }
  
 public void exibirMenu() {
    System.out.println("1 - Jogar");
    System.out.println("2 - Regras");
    System.out.println("0 - Sair");
    System.out.print("Escolha uma opção: ");
  }

  @Override
  public int lerOpcao() {
    if (scanner.hasNextInt()) {
      return scanner.nextInt();
    }
    scanner.next(); 
    return -1;
  }

  public void rules(){
    System.out.println("Regras do jogo da velha: \n");
    System.out.println("Jogador 1: X\nJogador 2: O\n");
    System.out.println("alinhe seus simbolos na horizontal, vertical ou diagonal para ganhar.");
  }

  @Override
  public void exibirOpcaoInvalida() {
    System.out.println("Opção inválida! Tente novamente.");
  }

  @Override
  public void clearView() {
    try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
    } 
		catch (Exception e) {
			e.printStackTrace();
    }
  }
}
