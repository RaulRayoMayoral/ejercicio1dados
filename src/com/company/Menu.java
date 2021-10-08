package com.company;

import java.util.Scanner;

public class Menu {

    Juego juego;
    Configuracion configuracion;
    private final Scanner sc = new Scanner(System.in);

    public Menu(Juego juego, Configuracion configuracion){
        this.juego = juego;
        this.configuracion = configuracion;
    }

    public void show(){
        menuPrincipal();
    }

    public void menuPrincipal() {
        int stop;
        String nombre;
        do {
            System.out.println("1. Jugar a los dados");
            System.out.println("2. Si tienes curiosidad pon dos");
            System.out.println("3. Exit");
            stop = sc.nextInt();
            sc.nextLine();
            switch (stop) {
                case 1:
                    juego.play();
                    break;

                case 2:
                    System.out.println("Como te llamas");
                    nombre = sc.nextLine();
                    System.out.println("Encantado de conocerte " + nombre);
                    System.out.println("Que tenga un buen dia");
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escoge entre el 1 ,el 2 y el 3");
            }
        } while(stop !=3);
    }
}

