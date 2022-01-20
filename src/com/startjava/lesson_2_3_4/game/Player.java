package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] number = new int[10];
    private int attempt;
    private int countWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setNumber(int number) {
        if ((number > 0) && (number <= 100)) {
            attempt++;
            this.number[attempt - 1] = number;
            return true;
        }

        System.out.println("Ввели недопустимое число! Число должно принадлежать диапазону (0, 100]");
        return false;
    }

    public int getNumber() {
        return number[attempt - 1];
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(number, attempt);
    }

    public void resetNumbers() {
        Arrays.fill(number, 0, attempt, 0);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void incrementWin() {
        countWins++;
    }

    public int getCountWins() {
        return countWins;
    }
}