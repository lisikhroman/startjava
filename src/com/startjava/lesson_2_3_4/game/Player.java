package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
    private int attempt = 0;
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
            numbers[attempt - 1] = number;
            return true;
        }
        return false;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
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