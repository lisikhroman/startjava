package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private long a;
    private long b;
    private char operation;

    public void setA(long a) {
        this.a = a;
    }

    public void setB(long b) {
        this.b = b;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public long calculate() {
        switch(operation) {
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '/' :
                return a / b;
            case '%' :
                return a % b;
            case '^' :
                long result = 1;
                for(int i = 1; i <= b; i++) {
                    result *= a;
                }
                return result;
            default:
                System.out.println("Введите корректный знак математической операции!");
                return 0;
        }
    }
}