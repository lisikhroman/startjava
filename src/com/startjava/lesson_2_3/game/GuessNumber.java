package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void run() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        System.out.println("Компьютер загадал число");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Угадывает число первый игрок " + firstPlayer.getName() + ". Введите число от 0 до 100:");
            firstPlayer.setNumber(scanner.nextInt());
            scanner.nextLine();
            if (firstPlayer.getNumber() < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (firstPlayer.getNumber() > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю " + firstPlayer.getName() + "! Вы угадали загаданное компьютером число.");
                break;
            }

            System.out.println("Угадывает число второй игрок " + secondPlayer.getName() + ". Введите число от 0 до 100:");
            secondPlayer.setNumber(scanner.nextInt());
            scanner.nextLine();
            if (secondPlayer.getNumber() < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (secondPlayer.getNumber() > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю " + secondPlayer.getName() + "! Вы угадали загаданное компьютером число.");
                break;
            }
        } while(true);
    }
}