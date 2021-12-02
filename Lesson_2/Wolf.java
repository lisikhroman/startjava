public class Wolf {

    String gender;
    String nickname;
    String colour;
    float weight;
    int age;

    void move() {
        System.out.println("идет");
    }

    void sit() {
        System.out.println("сидит");
    }

    void run() {
        System.out.println("бежит");
    }

    String howl() {
        return "воет";
    }

    String hunt() {
        return "охотится";
    }
}