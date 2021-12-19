import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.println("Введите имя второго игрока:");
        Player secondPlayer = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String solution = "yes";
        
        do {
            if (game.playingGame() == true) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                solution = scanner.nextLine();
            }
        } while (!"no".equals(solution));
    }
}