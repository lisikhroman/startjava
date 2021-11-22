public class MyFirstGame {

    public static void main(String[] args) {
        long variableUser = 1;
        long variablePC = 49;
        while (variableUser != variablePC) {
            if (variableUser < variablePC) {
                variableUser = variableUser + 10;
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (variableUser > variablePC) {
                variableUser = variableUser - 9;
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}