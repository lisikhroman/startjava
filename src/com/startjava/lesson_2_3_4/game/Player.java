package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] number = new int[10];
    private int attempt = 0;
    private int win = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        if ((number > 0) && (number <= 100)) {
            this.number[index] = number;
        }
    }

    public int getNumber(int index) {
        return number[index];
    }

    public int[] getAllNumbers() {
        return number;
    }

    public void resetNumbers(int attempts) {
        Arrays.fill(number, 0, attempts, 0);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setQuantityWin() {
        this.win++;
    }

    public int getTotalWin() {
        return win;
    }
}