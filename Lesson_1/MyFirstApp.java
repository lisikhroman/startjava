public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        // int result = 1;
        // for(int i = 2; i <= 5; i++) {
        //     result = result + i;
        //     if(result % 2 == 0) {
        //         System.out.println("Число " + result + " является четным");
        //     }
        //     else {
        //         System.out.println("Число " + result + " является нечетным");
        //     }
        // }
        // System.out.println("1 + 2 + 3 + 4 + 5 =" + result);
        
        // int i = 2;
        // int result = 1;
        // while(i <= 5) {
        //     result = result + i;
        //     if(result % 2 == 0) {
        //         System.out.println("Число " + result + " является четным");
        //     }
        //     else {
        //         System.out.println("Число " + result + " является нечетным");
        //     }
        //     i++;
        // }
        // System.out.println("1 + 2 + 3 + 4 + 5 =" + result);

        int i = 2;
        int result = 1;
        do {
            result = result + i;
            if(result % 2 == 0) {
                System.out.println("Число " + result + " является четным");
            }
            else {
                System.out.println("Число " + result + " является нечетным");
            }
            i++;
        } while(i <= 5);
        System.out.println("1 + 2 + 3 + 4 + 5 =" + result);
    }
}