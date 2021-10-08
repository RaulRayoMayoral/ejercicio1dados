package com.company;

public class Jugador {

    private String name;
    private boolean win;
    private int perdidas = 0, ganadas = 0, partidas = 0;
    Dado dado = new Dado();

    public Jugador() {
        win = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getWin() {return win;}

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setGanadas(int ganadas) {
        this.ganadas += ganadas;
    }

    public void setPartidas(int partidas) {
        this.partidas += partidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas += perdidas;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", win=" + win + '}';
    }
}
