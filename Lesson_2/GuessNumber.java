import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private String winnersName;
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public boolean playingGame() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(10);
        int guessingOrder = 1;

        System.out.println("Компьютер загадал число" + hiddenNumber);
        do {
            Scanner scannerInt1 = new Scanner(System.in);
            Scanner scannerInt2 = new Scanner(System.in);
            switch(guessingOrder) {
                case 1 :
                    System.out.println("Угадывает число первый игрок " + firstPlayer.getPlayername() + ". Введите число от 0 до 100:");
                    firstPlayer.setPlayernumber(scannerInt1.nextInt());
                    if (firstPlayer.getPlayernumber() < hiddenNumber) {
                        System.out.println("Данное число меньше того, что загадал компьютер");
                        guessingOrder = 2;
                    } else if (firstPlayer.getPlayernumber() > hiddenNumber) {
                        System.out.println("Данное число больше того, что загадал компьютер");
                        guessingOrder = 2;
                    } else {
                        break;
                    }
                case 2 :
                    System.out.println("Угадывает число второй игрок " + secondPlayer.getPlayername() + ". Введите число от 0 до 100:");
                    secondPlayer.setPlayernumber(scannerInt2.nextInt());
                    if (secondPlayer.getPlayernumber() < hiddenNumber) {
                        System.out.println("Данное число меньше того, что загадал компьютер");
                        guessingOrder = 1;
                    } else if (secondPlayer.getPlayernumber() > hiddenNumber) {
                        System.out.println("Данное число больше того, что загадал компьютер");
                        guessingOrder = 1;
                    } else {
                        break;
                    }
            }
        } while (firstPlayer.getPlayernumber() != hiddenNumber & secondPlayer.getPlayernumber() != hiddenNumber);
        if (guessingOrder == 1) {
            winnersName = firstPlayer.getPlayername();
        } else {
            winnersName = secondPlayer.getPlayername();
        }
        System.out.println("Поздравляю " + winnersName + "! Вы угадали загаданное компьютером число.");
        return true;
    }
}