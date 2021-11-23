public class Cycle {
    public static void main(String[] args) {
        System.out.println("Выводим на консоль с помощью цикла for все числа от [0, 20]");
        for(int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Выводим на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        int j = 6;
        while(j >= -6) {
            System.out.println(j);
            j -= 2;
        }

        System.out.println("Подсчитаем с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выводим сумму на консоль");
        int k = 10;
        int sum = 0;
        do {
            if(k % 2 != 0) {
                sum += k;
            }
            k++;
        } while(k <= 20);
        System.out.println("11 + 13 + 15 + 17 + 19 = " + sum);
    }
}