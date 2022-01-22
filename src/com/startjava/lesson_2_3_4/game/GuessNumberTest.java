package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String solution = "yes";
        Scanner scanner = new Scanner(System.in);
        int quantityGame = 0;

        GuessNumber game = new GuessNumber(createPlayers());

        do {
            if ("yes".equals(solution)) {
                game.run();
            }

            quantityGame++;

            if (quantityGame == 3) {
                break;
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            solution = scanner.nextLine();
        } while (!"no".equals(solution));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите имя " + i + " игрока:");
            players[i - 1] = new Player(scanner.nextLine());
        }
        return players;
    }
}