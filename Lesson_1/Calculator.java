public class Calculator {

    public static void main(String[] args) {
        long variable1 = 2;
        long variable2 = 10;
        char operation = '^';
        long result;
        if(operation == '+') {
            result = variable1 + variable2;
            System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
        } else if (operation == '-') {
            result = variable1 - variable2;
            System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
        } else if (operation == '*') {
            result = variable1 * variable2;
            System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
        } else if (operation == '/') {
            result = variable1 / variable2;
            System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
        } else if (operation == '%') {
            result = variable1 % variable2;
            System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
        } else if (operation == '^') {
            if (variable2 == 1) {
                result = variable1;
                System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
            } else {
                result = variable1;
                for(int i = 2; i <= variable2; i++) {
                result = result * variable1;
                }
                System.out.println(variable1 + " " + operation + " " + variable2 + " = " + result);
            }
        }
    }
}