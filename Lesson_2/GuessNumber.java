import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void playingGame() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100);

        System.out.println("Компьютер загадал число");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Угадывает число первый игрок " + firstPlayer.getPlayerName() + ". Введите число от 0 до 100:");
            firstPlayer.setPlayerNumber(scanner.nextInt());
            scanner.nextLine();
            if (firstPlayer.getPlayerNumber() < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (firstPlayer.getPlayerNumber() > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю " + firstPlayer.getPlayerName() + "! Вы угадали загаданное компьютером число.");
                break;
            }
            System.out.println("Угадывает число второй игрок " + secondPlayer.getPlayerName() + ". Введите число от 0 до 100:");
            secondPlayer.setPlayerNumber(scanner.nextInt());
            scanner.nextLine();
            if (secondPlayer.getPlayerNumber() < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (secondPlayer.getPlayerNumber() > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Поздравляю " + secondPlayer.getPlayerName() + "! Вы угадали загаданное компьютером число.");
                break;
            }
        } while(true);
    }
}