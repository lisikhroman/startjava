public class Calculator {

    public static void main(String[] args) {
        long firstOperandForOperation = 2;
        long secondOperandForOperation = 10;
        char operation = '^';
        long result = 0;
        if(operation == '+') {
            result = firstOperandForOperation + secondOperandForOperation;
        } else if(operation == '-') {
            result = firstOperandForOperation - secondOperandForOperation;
        } else if(operation == '*') {
            result = firstOperandForOperation * secondOperandForOperation;
        } else if(operation == '/') {
            result = firstOperandForOperation / secondOperandForOperation;
        } else if(operation == '%') {
            result = firstOperandForOperation % secondOperandForOperation;
        } else if(operation == '^') {
            result = 1;
            for(int i = 1; i <= secondOperandForOperation; i++) {
                result *= firstOperandForOperation;
            }
        }
        System.out.println(firstOperandForOperation + " " + operation + " " + secondOperandForOperation + " = " + result);
    }
}