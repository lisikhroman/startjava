package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("самец");
        wolfOne.setNickname("Дружок");
        wolfOne.setColour("коричневый");
        wolfOne.setWeight(15.5f);
        wolfOne.setAge(7);
 
        System.out.println(wolfOne.getGender() + " волка");
        System.out.println("по кличке " + wolfOne.getNickname());
        System.out.println("имеет " + wolfOne.getColour() + " окрас");
        System.out.println("весом он " + wolfOne.getWeight() + " килограмм");
        System.out.println("и возрастом " + wolfOne.getAge() + " лет");
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}