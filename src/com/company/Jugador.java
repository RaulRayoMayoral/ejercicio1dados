package com.company;

public class Jugador {

    private String name;
    private boolean win;
    private int perdidas = 0, ganadas = 0, partidas = 0;
    Dado dado = new Dado();

    public Jugador() {
        win = false;
    }

    public boolean getWin() {return win;}

    public void setWin(boolean win) {
        this.win = win;
    }
    public String getName() {
        return name;
    }
    public void setGanadas(int ganadas) {
        this.ganadas += ganadas;
    }

    public void setPartidas(int partidas) {
        this.partidas += partidas;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas += perdidas;
    }
    public int getPerdidas() {
        return perdidas;
    }

    public int getGanadas() {
        return ganadas;
    }

    public int getPartidas() {
        return partidas;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", win=" + win + '}';
    }
}
