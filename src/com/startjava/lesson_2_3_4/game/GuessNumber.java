package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void run() {
        castLots();
        for (int i = 0; i < 3; i++) {
            initGame();
            runGameplay();
            outputPlayersNumbers();
        }
        outputWinner();
    }

    private void castLots() {
        System.out.println("Игроки бросают жребий");
        Random random = new Random();

        for (int i = 0; i < players.length; i++) {
            int indexToReplace = random.nextInt(players.length);
            Player temp = players[indexToReplace];
            players[indexToReplace] = players[i];
            players[i] = temp;
        }
    }

    private void initGame() {
        for (Player player : players) {
            player.resetNumbers();
            player.setAttempt(0);
        }

        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;
        System.out.println("Компьютер загадал число.");
        System.out.println("У каждого игрока по 10 попыток!");
    }

    private void runGameplay() {
        boolean result = false;
        while (checkAttempts()) {
            for (int i = 0; i < players.length; i++) {
                if (guessNumber(i)) {
                    result = true;
                    break;
                }
            }

            if (result) {
                break;
            }
        }
    }

    private boolean guessNumber(int indexPlayer) {
        Scanner scanner = new Scanner(System.in);
        boolean numberInRange = false;
        boolean numberLess;

        do {
            if (players[indexPlayer].getAttempt() <= 10) {
                System.out.print("Угадывает число игрок " + players[indexPlayer].getName() +
                        ". Введите число от 0 до 100:");
                numberInRange = players[indexPlayer].setNumber(scanner.nextInt());

                if (numberInRange) {
                    if (players[indexPlayer].getNumber() == hiddenNumber) {
                        System.out.println("Игрок " + players[indexPlayer].getName() + " угадал число " + hiddenNumber +
                                " c " + players[indexPlayer].getAttempt() + " попытки.");
                        players[indexPlayer].incrementWin();
                        return true;
                    }

                    numberLess = players[indexPlayer].getNumber() < hiddenNumber;
                    String comparisonResult = (numberLess) ? "Число меньше" : "Число больше";
                    System.out.println(comparisonResult);

                    if (players[indexPlayer].getAttempt() == 10) {
                        System.out.println("У " + players[indexPlayer].getName() + " закончились попытки");
                    }
                } else {
                    System.out.println("Ввели недопустимое число! Число должно принадлежать диапазону (0, 100]");
                }
            }
        } while (!numberInRange);
        return false;
    }

    private void outputPlayersNumbers() {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " вводил следующие числа: ");
            int[] numbers = player.getAllNumbers();
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("\n");
        }
    }

    private void outputWinner() {
        int[] resultGame = {players[0].getCountWins(), players[1].getCountWins(), players[2].getCountWins()};

        int temp;
        for (int i = resultGame.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (resultGame[j] > resultGame[j + 1]) {
                    temp = resultGame[j];
                    resultGame[j] = resultGame[j + 1];
                    resultGame[j + 1] = temp;
                }
            }
        }

        int tie = 0;
        for (int i = 0; i <= resultGame.length - 1; i++) {
            if (resultGame[0] == players[i].getCountWins()) {
                tie++;
            }
        }

        if (tie == resultGame.length) {
            System.out.println("По результатам трех игр: ничья!");
        } else {
            for (int i = 0; i <= resultGame.length - 1; i++) {
                if (resultGame[2] == players[i].getCountWins()) {
                    System.out.println("По результатам трех игр победил игрок: " + players[i].getName());
                }
            }
        }
    }

    private boolean checkAttempts() {
        int[] playersAttempts = new int[players.length];

        for (int i = 0; i < players.length; i++) {
            playersAttempts[i] = players[i].getAttempt();
        }

        for (int playersAttempt : playersAttempts) {
            if (playersAttempt != 10) {
                return true;
            }
        }
        return false;
    }
}