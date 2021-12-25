import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solution = "yes";
        
        do {
            if ("yes".equals(solution)) {
                Calculator calculator = new Calculator();
                System.out.println("Введите первое число: ");
                calculator.setA(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Введите знак математической операции: ");
                calculator.setOperation(scanner.next().charAt(0));
                System.out.println("Введите второе число: ");
                calculator.setB(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Результат вычисления: " + calculator.calculate());
            }
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            solution = scanner.nextLine();
        } while (!"no".equals(solution));
    }
}