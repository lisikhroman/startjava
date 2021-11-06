public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Hello, World");
    
        for (int i = 0; i < args.length; ++i) {
            System.out.printf("args[%d] = %s\n", i, args[i]);
        }
    }
}