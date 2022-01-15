
public class Person {

    String gender = "мужской";
    String name = "Роман";
    float height = 178.5f;
    float weight = 90.7f;
    int age = 31;

    void move() {
        System.out.println("Вы идёте");
    }

    boolean sit() {
        System.out.println("Вы сели");
        return true;
    }

    void run() {
        System.out.println("Вы перешли на бег");
    }

    String talk() {
        return "Привет";
    }

    void learnJava() {
        System.out.println("Вы изучаете Java");
    }
}