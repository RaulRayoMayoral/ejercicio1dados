package com.company;

import java.util.Scanner;

public class Juego {
    private final Scanner sc = new Scanner(System.in);
    private Configuracion configuracion;
    private final Menu menu;
    final Dado dado;
    String op;
    private final Jugador[] player = new Jugador[2];

    public Juego() {
        menu = new Menu(this, configuracion);
        configuracion = new Configuracion();
        dado = new Dado();
        this.player[0] = new Jugador();
        this.player[1] = new Jugador();
        player[0].setName("Player" + 1);
        player[1].setName("Player" + 2);
    }

    public void start() {
        menu.show();
    }

    public void play() {
        System.out.println("Dados que hay: " + configuracion.getDado());
        System.out.println();
        System.out.println("Jugadores que hay: " + configuracion.getJugador() );
        System.out.println();
        for (int i = 0; i < configuracion.getJugador(); i++) {
            player[i].dado.jugar();
            System.out.println(player[i].getName() + " ha sacado " + player[i].dado.dado + " " +  player[i].dado.dado2 + " " +  player[i].dado.dado3);

            if (player[i].dado.dado == player[i].dado.dado2 && player[i].dado.dado2 == player[i].dado.dado3){
                player[i].setWin(true);
            }
        }
        player[1].setPartidas(1);
        player[0].setPartidas(1);

        if ( player[0].getWin() &&  player[1].getWin()) {
            System.out.println("Empate");

        }else if ( player[0].getWin()){
            System.out.println("Win para el " + player[0].getName());
            player[0].setGanadas(1);
            player[1].setPerdidas(1);
            player[0].setWin(false);
        }else if ( player[1].getWin()){
            System.out.println("Win para el" + player[1].getName());
            player[1].setGanadas(1);
            player[0].setPerdidas(1);
            player[1].setWin(false);
        }else{
            System.out.println("No gano nadie");
        }
        System.out.println();
        System.out.print("Quieres seguir jugando? (Si/No) ");
        op = sc.nextLine();
        System.out.println();
        if (op.equals("Si")){
            play();
        }else{
            for (int i = 0; i < configuracion.getJugador(); i++) {
                System.out.println( player[i].getName() + " ha ganado " +  player[i].getGanadas() + " partidas"+", ha perdido " +  player[i].getPerdidas() + " partidas "+ "y ha jugado " +  player[i].getPartidas() + " partidas.");
            }
            System.out.println();
        }
    }
}
