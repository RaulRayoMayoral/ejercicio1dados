package com.company;

import java.util.Scanner;

public class Menu {

    Juego juego;
    Configuracion configuracion;
    private final Scanner sc = new Scanner(System.in);

    public Menu(Juego juego, Configuracion configGame){
        this.juego = juego;
        this.configuracion = configuracion;
    }

    public void show(){
        menuPrincipal();
    }

    public void menuPrincipal() {
        int op;
        do {
            System.out.println("1. Jugar a los dados");
            System.out.println("2. Exit");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    juego.play();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Escoge entre el 1 y el 2");
            }
        } while(op !=2);
    }
}

