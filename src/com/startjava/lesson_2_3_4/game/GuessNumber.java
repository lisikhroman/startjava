package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {

    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void run() {
        drawLots(players);

        for (int i = 0; i < 3; i++) {
            initializingGame();
            runGameplay();
            endGame();
            saveAttempts();
        }

        outputResult();
    }

    public void drawLots(Player[] players) {
        System.out.println("Игроки бросают жребий");
        List<Player> playersList = Arrays.asList(players);
        Collections.shuffle(playersList);
        playersList.toArray(players);
    }

    public void initializingGame() {
        for (int i = 0; i <= 2; i++) {
            players[i].resetNumbers(players[i].getAttempt());
            players[i].setAttempt(1);
        }

        Random random = new Random();
        hiddenNumber = random.nextInt(100) + 1;

        System.out.println("Компьютер загадал число.");
        System.out.println("У каждого игрока по 10 попыток!");
    }

    public void runGameplay() {
        boolean result = false;
        while (players[0].getAttempt() <= 10 || players[1].getAttempt() <= 10 || players[2].getAttempt() <= 10) {
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
            if (players[indexPlayer].getAttempt() <= 10) {
                System.out.print("Угадывает число игрок " + players[indexPlayer].getName() + ". Введите число от 0 до 100:");
                numberInRange = players[indexPlayer].setNumber(scanner.nextInt(), players[indexPlayer].getAttempt() - 1);
                if (numberInRange) {
                    if (players[indexPlayer].getNumber(players[indexPlayer].getAttempt() - 1) == hiddenNumber) {
                        System.out.println("Игрок " + players[indexPlayer].getName() + " угадал число " + hiddenNumber + " c " + players[indexPlayer].getAttempt() + " попытки.");
                        if (indexPlayer == 0) {
                            players[1].decreaseAttempt();
                            players[2].decreaseAttempt();
                        } else if (indexPlayer == 1) {
                            players[0].decreaseAttempt();
                            players[2].decreaseAttempt();
                        } else {
                            players[0].decreaseAttempt();
                            players[1].decreaseAttempt();
                        }
                        players[indexPlayer].incrementWin();
                        return true;
                    } else {
                        String comparisonResult = ((players[indexPlayer].getNumber(players[indexPlayer].getAttempt() - 1) < hiddenNumber) & (players[indexPlayer].getNumber(players[indexPlayer].getAttempt() - 1) != hiddenNumber)) ? "Данное число меньше того, что загадал компьютер" : "Данное число больше того, что загадал компьютер";
                        System.out.println(comparisonResult);
                    }

                    if (players[indexPlayer].getAttempt() == 10) {
                        System.out.println("У " + players[indexPlayer].getName() + " закончились попытки");
                    }
                    players[indexPlayer].incrementAttempt();
                }
            }
        } while (!numberInRange);
        return false;
    }

    public void endGame() {
        if (players[0].getAttempt() > 10) {
            players[0].setAttempt(10);
        }

        if (players[1].getAttempt() > 10) {
            players[1].setAttempt(10);
        }

        if (players[2].getAttempt() > 10) {
            players[2].setAttempt(10);
        }

        int[] firstPlayerNumbers = players[0].getAllNumbers(players[0].getAttempt());
        int[] secondPlayerNumbers = players[1].getAllNumbers(players[1].getAttempt());
        int[] thirdPlayerNumbers = players[2].getAllNumbers(players[2].getAttempt());

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