package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solution = "yes";

        do {
            if ("yes".equals(solution)) {
                System.out.print("Введите математическое выражение: ");
                Calculator.setMathematicalExpression(scanner.nextLine());
                System.out.println("Результат вычисления: " + Calculator.calculate());
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            solution = scanner.nextLine();
        } while (!"no".equals(solution));
    }
}