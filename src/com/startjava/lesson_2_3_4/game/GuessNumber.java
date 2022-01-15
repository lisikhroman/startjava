package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public record GuessNumber(Player[] players) {

    public String run() {
        initialGame();

        return outputResult();
    }

    public void initialGame() {

        for (int i = 0; i <= 2; i++) {
            players[i].resetNumbers(players[i].getAttempt());
            players[i].setAttempt(1);
        }

        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;

        System.out.println("Компьютер загадал число.");
        System.out.println("У каждого игрока по 10 попыток!");

        playingGame(players[0].getAttempt(), players[1].getAttempt(), players[2].getAttempt(), hiddenNumber);
    }

    public void playingGame(int numberAttemptFirstPlayer, int numberAttemptSecondPlayer, int numberAttemptThirdPlayer, int hiddenNumber) {
        while (numberAttemptFirstPlayer <= 10 || numberAttemptSecondPlayer <= 10 || numberAttemptThirdPlayer <= 10) {
            Scanner scanner = new Scanner(System.in);
            if (numberAttemptFirstPlayer <= 10) {
                System.out.print("Угадывает число первым игрок " + players[0].getName() + ". Введите число от 0 до 100:");
                players[0].setNumber(scanner.nextInt(), numberAttemptFirstPlayer - 1);
                scanner.nextLine();

                String comparisonResult = ((players[0].getNumber(numberAttemptFirstPlayer - 1) < hiddenNumber) & (players[0].getNumber(numberAttemptFirstPlayer - 1) != hiddenNumber)) ? "Данное число меньше того, что загадал компьютер" : "Данное число больше того, что загадал компьютер";
                System.out.println(comparisonResult);

                if (players[0].getNumber(numberAttemptFirstPlayer - 1) == hiddenNumber) {
                    System.out.println("Игрок " + players[0].getName() + " угадал число " + hiddenNumber + " c " + numberAttemptFirstPlayer + " попытки.");
                    numberAttemptSecondPlayer--;
                    numberAttemptThirdPlayer--;
                    players[0].setQuantityWin();
                    break;
                }

                if (numberAttemptFirstPlayer == 10) {
                    System.out.println("У " + players[0].getName() + " закончились попытки");
                }
                numberAttemptFirstPlayer++;
            }

            if (numberAttemptSecondPlayer <= 10) {
                System.out.print("Угадывает число вторым игрок " + players[1].getName() + ". Введите число от 0 до 100:");
                players[1].setNumber(scanner.nextInt(), numberAttemptSecondPlayer - 1);
                scanner.nextLine();

                String comparisonResult = ((players[1].getNumber(numberAttemptSecondPlayer - 1) < hiddenNumber) & (players[1].getNumber(numberAttemptSecondPlayer - 1) != hiddenNumber)) ? "Данное число меньше того, что загадал компьютер" : "Данное число больше того, что загадал компьютер";
                System.out.println(comparisonResult);

                if (players[1].getNumber(numberAttemptSecondPlayer - 1) == hiddenNumber) {
                    System.out.println("Игрок " + players[1].getName() + " угадал число " + hiddenNumber + " c " + numberAttemptSecondPlayer + " попытки.");
                    numberAttemptFirstPlayer--;
                    numberAttemptThirdPlayer--;
                    players[1].setQuantityWin();
                    break;
                }

                if (numberAttemptSecondPlayer == 10) {
                    System.out.println("У " + players[1].getName() + " закончились попытки");
                }
                numberAttemptSecondPlayer++;
            }

            if (numberAttemptThirdPlayer <= 10) {
                System.out.print("Угадывает число третьим игрок " + players[2].getName() + ". Введите число от 0 до 100:");
                players[2].setNumber(scanner.nextInt(), numberAttemptThirdPlayer - 1);

                String comparisonResult = ((players[2].getNumber(numberAttemptThirdPlayer - 1) < hiddenNumber) & (players[2].getNumber(numberAttemptThirdPlayer - 1) != hiddenNumber)) ? "Данное число меньше того, что загадал компьютер" : "Данное число больше того, что загадал компьютер";
                System.out.println(comparisonResult);

                if (players[2].getNumber(numberAttemptThirdPlayer - 1) == hiddenNumber) {
                    System.out.println("Игрок " + players[2].getName() + " угадал число " + hiddenNumber + " c " + numberAttemptThirdPlayer + " попытки.");
                    numberAttemptFirstPlayer--;
                    numberAttemptSecondPlayer--;
                    players[2].setQuantityWin();
                    break;
                }

                if (numberAttemptThirdPlayer == 10) {
                    System.out.println("У " + players[2].getName() + " закончились попытки");
                }
                numberAttemptThirdPlayer++;
            }
        }

        endGame(numberAttemptFirstPlayer, numberAttemptSecondPlayer, numberAttemptThirdPlayer);
    }

    public void endGame(int numberAttemptFirstPlayer, int numberAttemptSecondPlayer, int numberAttemptThirdPlayer) {
        if (numberAttemptFirstPlayer > 10) {
            numberAttemptFirstPlayer = 10;
        }

        if (numberAttemptSecondPlayer > 10) {
            numberAttemptSecondPlayer = 10;
        }

        if (numberAttemptThirdPlayer > 10) {
            numberAttemptThirdPlayer = 10;
        }

        int[] firstPlayerNumbers = Arrays.copyOf(players[0].getAllNumbers(), numberAttemptFirstPlayer);
        int[] secondPlayerNumbers = Arrays.copyOf(players[1].getAllNumbers(), numberAttemptSecondPlayer);
        int[] thirdPlayerNumbers = Arrays.copyOf(players[2].getAllNumbers(), numberAttemptThirdPlayer);

        System.out.println("Игрок " + players[0].getName() + " вводил следующие числа: ");
        for (int firstPlayerNumber : firstPlayerNumbers) {
            System.out.print(firstPlayerNumber + " ");
        }
        System.out.println("\n");

        System.out.println("Игрок " + players[1].getName() + " вводил следующие числа: ");
        for (int secondPlayerNumber : secondPlayerNumbers) {
            System.out.print(secondPlayerNumber + " ");
        }
        System.out.println("\n");

        System.out.println("Игрок " + players[2].getName() + " вводил следующие числа: ");
        for (int thirdPlayerNumber : thirdPlayerNumbers) {
            System.out.print(thirdPlayerNumber + " ");
        }
        System.out.println("\n");

        saveAttempts(numberAttemptFirstPlayer, numberAttemptSecondPlayer, numberAttemptThirdPlayer);
    }

    public void saveAttempts(int numberAttemptFirstPlayer, int numberAttemptSecondPlayer, int numberAttemptThirdPlayer) {
        players[0].setAttempt(numberAttemptFirstPlayer);
        players[1].setAttempt(numberAttemptSecondPlayer);
        players[2].setAttempt(numberAttemptThirdPlayer);
    }

    public String outputResult() {
        int[] resultGame = {players[0].getTotalWin(), players[1].getTotalWin(), players[2].getTotalWin()};

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
            if (resultGame[0] == players[i].getTotalWin()) {
                tie++;
            }
        }

        String winnerName = null;
        if (tie == resultGame.length) {
            winnerName = "ничья";
        } else {
            for (int i = 0; i <= resultGame.length - 1; i++) {
                if (resultGame[2] == players[i].getTotalWin()) {
                    winnerName = players[i].getName();
                }
            }
        }
        return winnerName;
    }
}