package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] number = new int[10];
    private int attempt;
    private int win;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setNumber(int number, int index) {
        if ((number > 0) && (number <= 100)) {
            this.number[index] = number;
            return true;
        } else {
            System.out.println("Ввели недопустимое число! Число должно принадлежать диапазону (0, 100]");
            return false;
        }
    }

    public int getNumber(int index) {
        return number[index];
    }

    public int[] getAllNumbers(int length) {
        return Arrays.copyOf(number, length);
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

    public void incrementAttempt() {
        attempt++;
    }

    public void decreaseAttempt() {
        attempt--;
    }

    public void incrementWin() {
        win++;
    }

    public int getCountWins() {
        return win;
    }
}