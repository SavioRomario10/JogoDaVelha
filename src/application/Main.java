package application;

import menu.InicializacaoView;
import menu.PageInitial;

public class Main {
  public static void main(String[] args) {
    
    UI ui = new UI();  
    InicializacaoView iv = new PageInitial();


    ui.initial((PageInitial)iv);
  }
}