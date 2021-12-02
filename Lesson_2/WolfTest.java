public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "самец";
        wolfOne.nickname = "Дружок";
        wolfOne.colour = "коричневый";
        wolfOne.weight = 15.5f;
        wolfOne.age = 7;

        System.out.println(wolfOne.gender + " волка");
        System.out.println("по кличке " + wolfOne.nickname);
        System.out.println("имеет " + wolfOne.colour + " окрас");
        System.out.println("весом он " + wolfOne.weight + " килограмм");
        System.out.println("и возрастом " + wolfOne.age + " лет");
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}