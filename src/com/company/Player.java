package com.company;

public class Player {

    private char pin;
    private int score;
    private String name;

    public Player(char pin, int score, String name) {
        this.pin = pin;
        this.score = score;
        this.name = name;
    }

    public char getPin() {
        return this.pin;
    }

    public void setPin(char pin) {
        this.pin = pin;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public String getName() {
        return this.name;
    }

}