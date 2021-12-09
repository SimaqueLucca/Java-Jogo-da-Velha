package com.company;

public class Player {

    private char pin;
    private int plays;
    private String name;

    public Player(char pin, int plays, String name) {
        this.pin = pin;
        this.plays = plays;
        this.name = name;
    }

    public char getPin() {
        return this.pin;
    }

    public void setPin(char pin) {
        this.pin = pin;
    }

    public int getPlays() {
        return this.plays;
    }

    public void makeAMove() {
        this.plays -= 1;
    }

    public String getName() {
        return this.name;
    }

}