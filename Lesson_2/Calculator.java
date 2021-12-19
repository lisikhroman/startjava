public class Calculator {

    private long a;
    private long b;
    private char operation;
    private long result;

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
            result = a + b;
            break;
        case '-' :
            result = a - b;
            break;
        case '*' :
            result = a * b;
            break;
        case '/' :
            result = a / b;
            break;
        case '%' :
            result = a % b;
            break;
        case '^' :
            result = 1;
            for(int i = 1; i <= b; i++) {
                result *= a;
            }
            break;
        default:
            System.out.println("Введите корректный знак математической операции!");
        }
        return result;
    }
}