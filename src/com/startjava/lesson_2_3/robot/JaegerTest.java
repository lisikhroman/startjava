package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();

        jaegerOne.setMadelName("Cherno Alpha");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("Russia");
        jaegerOne.setWeapon("Incinerator turbines");
        jaegerOne.setHeight(85.34f);
        jaegerOne.setWeight(2.412f);
        jaegerOne.setSpeed(3);
        jaegerOne.setStrength(10);
        jaegerOne.setArmor(10);

        jaegerTwo.setMadelName("Crimson Typhoon");
        jaegerTwo.setMark("Mark-4");
        jaegerTwo.setOrigin("China");
        jaegerTwo.setWeapon("IB22 Plasmacaster");
        jaegerTwo.setHeight(76.2f);
        jaegerTwo.setWeight(1.722f);
        jaegerTwo.setSpeed(9);
        jaegerTwo.setStrength(8);
        jaegerTwo.setArmor(6);

        System.out.println("----------------------------------------------");
        System.out.println("Название первой модели егеря " + jaegerOne.getMadelName());
        System.out.println("марка егеря: " + jaegerOne.getMark());
        System.out.println("страна происхождения: " + jaegerOne.getOrigin());
        System.out.println("используемое оружие: " + jaegerOne.getWeapon());
        System.out.println("высота: " + jaegerOne.getHeight() + " м");
        System.out.println("вес:  " + jaegerOne.getWeight() + " т");
        System.out.println("скорость: " + jaegerOne.getSpeed());
        System.out.println("сила " + jaegerOne.getStrength());
        System.out.println("броня " + jaegerOne.getArmor());
        System.out.println("----------------------------------------------");
        System.out.println("Название второй модели егеря " + jaegerTwo.getMadelName());
        System.out.println("марка егеря: " + jaegerTwo.getMark());
        System.out.println("страна происхождения: " + jaegerTwo.getOrigin());
        System.out.println("используемое оружие: " + jaegerTwo.getWeapon());
        System.out.println("высота: " + jaegerOne.getHeight() + " м");
        System.out.println("вес:  " + jaegerOne.getWeight() + " т");
        System.out.println("скорость: " + jaegerTwo.getSpeed());
        System.out.println("сила " + jaegerTwo.getStrength());
        System.out.println("броня " + jaegerTwo.getArmor());
        System.out.println("----------------------------------------------");
        System.out.println("Егерь " + jaegerTwo.getMadelName() + " " + jaegerTwo.move() + " на подмогу");
        System.out.println("Егерь " + jaegerTwo.getMadelName() + " " + jaegerTwo.scanKaiju() + " местность на предмет наличия Кайдзю");
        System.out.println(jaegerOne.useWeapon() + " и меняет оружие");
        jaegerOne.setWeapon("Z-14 Tesla fists");
        System.out.println(jaegerOne.useWeapon());
    }
}