import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
        String solution = "yes";
        do {
            switch(solution) {
                case "yes" :
                    Calculator calculatorOne = new Calculator();
                    System.out.println("Введите первое число: ");
                    calculatorOne.setA(scannerInt.nextInt());
                    System.out.println("Введите знак математической операции: ");
                    calculatorOne.setOperation(scannerLine.next().charAt(0));
                    System.out.println("Введите второе число: ");
                    calculatorOne.setB(scannerInt.nextInt());
                    System.out.println("Результат вычисления: " + calculatorOne.calculate());
                    System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            }
            solution = scannerLine.nextLine();
        } while (!"no".equals(solution));
    }
}