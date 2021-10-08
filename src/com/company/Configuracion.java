package com.company;

public class Configuracion {
    private final int dado;
    private final int jugador;


    public int getJugador() {
        return jugador;
    }

    public Configuracion(){
        this.dado = 3;
        this.jugador =2;
    }

    public int getDado() {
        return dado;
    }

}
