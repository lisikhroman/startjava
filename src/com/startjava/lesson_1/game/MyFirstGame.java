package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        long guessedNumber = 1;
        long hiddenNumber = 49;
        while (guessedNumber != hiddenNumber) {
            if (guessedNumber < hiddenNumber) {
                guessedNumber += 10;
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (guessedNumber > hiddenNumber) {
                guessedNumber -= 9;
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}