package com.startjava.lesson_2_3_4.game;

import java.util.*;

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
            endGame();
            saveAttempts();
        }

        outputResult();
    }

    public void castLots() {
        System.out.println("Игроки бросают жребий");
        Random random = new Random();

        for (int i = 0; i < players.length; i++) {
            int indexToReplace = random.nextInt(players.length);
            Player temp = players[indexToReplace];
            players[indexToReplace] = players[i];
            players[i] = temp;
        }
    }

    public void initGame() {
        for (int i = 0; i <= 2; i++) {
            players[i].resetNumbers();
            players[i].setAttempt(0);
        }

        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;

        System.out.println("Компьютер загадал число.");
        System.out.println("У каждого игрока по 10 попыток!");
    }

    public void runGameplay() {
        boolean result = false;
        while (players[0].getAttempt() < 10 || players[1].getAttempt() < 10 || players[2].getAttempt() < 10) {
            for (int i = 0; i < players.length; i++) {
                if (playerGuessesNumber(i)) {
                    result = true;
                    break;
                }
            }

            if (result) {
                break;
            }
        }
    }

    public boolean playerGuessesNumber(int indexPlayer) {
        Scanner scanner = new Scanner(System.in);
        boolean numberInRange = false;
        do {
            if(players[indexPlayer].getAttempt() <= 10) {
                System.out.print("Угадывает число игрок " + players[indexPlayer].getName() + ". Введите число от 0 до 100:");
                numberInRange = players[indexPlayer].setNumber(scanner.nextInt());

                if(numberInRange) {
                    if(players[indexPlayer].getNumber() == hiddenNumber) {
                        System.out.println("Игрок " + players[indexPlayer].getName() + " угадал число " + hiddenNumber + " c " + players[indexPlayer].getAttempt() + " попытки.");
                        players[indexPlayer].incrementWin();
                        return true;
                    }

                    String comparisonResult = ((players[indexPlayer].getNumber() < hiddenNumber) & (players[indexPlayer].getNumber() != hiddenNumber)) ? "Данное число меньше того, что загадал компьютер" : "Данное число больше того, что загадал компьютер";
                    System.out.println(comparisonResult);

                    if (players[indexPlayer].getAttempt() == 10) {
                        System.out.println("У " + players[indexPlayer].getName() + " закончились попытки");
                    }
                }
            }
        } while (!numberInRange);
        return false;
    }

    public void endGame() {

        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " вводил следующие числа: ");
            int[] playersNumbers = player.getAllNumbers();
            for (int playersNumber : playersNumbers) {
                System.out.print(playersNumber + " ");
            }
            System.out.println("\n");
        }
    }

    public void saveAttempts() {
        players[0].setAttempt(players[0].getAttempt());
        players[1].setAttempt(players[1].getAttempt());
        players[2].setAttempt(players[2].getAttempt());
    }

    public void outputResult() {
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
}