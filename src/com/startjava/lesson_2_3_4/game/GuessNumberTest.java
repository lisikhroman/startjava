package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GuessNumberTest {

    private static String result;

    public static void main(String[] args) {
        String solution = "yes";
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[3];
        int quantityGame = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите имя " + i + " игрока:");
            players[i - 1] = new Player(scanner.nextLine());
        }

        drawLots(players);

        GuessNumber game = new GuessNumber(new Player[]{players[0], players[1], players[2]});

        do {
            if ("yes".equals(solution)) {
                result = game.run();
            }
            quantityGame++;
            if (quantityGame == 3) {
                break;
            } else {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                solution = scanner.nextLine();
            }
        } while (!"no".equals(solution));
        if (result.equals("ничья")) {
            System.out.print("По результатам трех игр: " + result);
        } else {
            System.out.print("По результатам трех игр победил игрок: " + result);
        }
    }

    public static void drawLots(Player[] players) {
        System.out.println("Игроки бросают жребий");
        List playersList = Arrays.asList(players);
        Collections.shuffle(playersList);
        playersList.toArray(players);
    }
}