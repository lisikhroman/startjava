package com.startjava.lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        float[] numbers1 = {5.1f, .5f, 200.5f};
        String[] text = new String[3];

        for (float number : numbers1) {
            System.out.println(number + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        for(String string: text){
            System.out.println(string);
        }
    }
}
