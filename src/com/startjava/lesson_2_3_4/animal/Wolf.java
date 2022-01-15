package com.startjava.lesson_2_3.animal;

public class Wolf {

    private String gender;
    private String nickname;
    private String colour;
    private float weight;
    private int age;

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public String getColour() {
        return colour;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    } 

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if(age > 8) {
           System.out.println("Некорректный возраст"); 
        } else {
            this.age = age;
        }
    }

    public void move() {
        System.out.println("идет");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void run() {
        System.out.println("бежит");
    }

    public String howl() {
        return "воет";
    }

    public String hunt() {
        return "охотится";
    }
}