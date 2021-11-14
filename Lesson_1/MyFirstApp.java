public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    
        int sum = 1 + 2;
        boolean isEventNumber1 = sum % 2 == 0;
        if(isEventNumber1 == true) {
            System.out.println("Число " + sum + " является четным");
        }
        else if (isEventNumber1 == false) {
            System.out.println("Число " + sum + " является нечетным");
        }

        int sum1 = sum + 3;
        boolean isEventNumber2 = sum1 % 2 == 0;
        if(isEventNumber2 == true) {
            System.out.println("Число " + sum1 + " является четным");
        }
        else if (isEventNumber2 == false) {
            System.out.println("Число " + sum1 + " является нечетным");
        }

        int sum2 = sum1 + 4;
        boolean isEventNumber3 = sum2 % 2 == 0;
        if(isEventNumber3 == true) {
            System.out.println("Число " + sum2 + " является четным");
        }
        else if (isEventNumber3 == false) {
            System.out.println("Число " + sum2 + " является нечетным");
        }

        int sum3 = sum2 + 5;
        boolean isEventNumber4 = sum3 % 2 == 0;
        if(isEventNumber4 == true) {
            System.out.println("Число " + sum3 + " является четным");
        }
        else if (isEventNumber4 == false) {
            System.out.println("Число " + sum3 + " является нечетным");
        }

        for (int i = 0; i < args.length; ++i) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}