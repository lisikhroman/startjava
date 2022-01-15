package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Integer.parseInt;

public class Calculator {

    private static String[] mathematicalExpression = new String[3];
    private static int a;
    private static int b;
    private static String operation;

    public static void setMathematicalExpression(String mathematicalExpression) {
        Calculator.mathematicalExpression = mathematicalExpression.split(" ");
    }

    public static long calculate() {
        a = parseInt(mathematicalExpression[0]);
        b = parseInt(mathematicalExpression[2]);
        operation = mathematicalExpression[1];

        if (a % 1 == 0 & b % 1 == 0 & a > 0 & b > 0) {

            long result =
                    switch (operation) {
                        case "+" -> {
                            yield a + b;
                        }
                        case "-" -> {
                            yield a - b;
                        }
                        case "*" -> {
                            yield a * b;
                        }
                        case "/" -> {
                            yield a / b;
                        }
                        case "%" -> {
                            yield a % b;
                        }
                        case "^" -> {
                            yield (long) Math.pow(a, b);
                        }
                        default -> throw new IllegalStateException("Введите корректный знак математической операции!");
                    };
            return result;
        } else {
            System.out.println("Введен некорректный аргумент! Введите в качестве аргументов целые положительные числа.");
        }
        return 0;
    }
}