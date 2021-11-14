public class ConditionalStatement {
    public static void main (String[] args) {
        int age = 32;
        boolean maleGender = true;
        float height = 2.1f;
        char firstNameLetter = 'M';

        if(age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        }

        if(maleGender == true) {
            System.out.println("Мужской пол");
        }

        if(maleGender != false) {
            System.out.println("Мужской пол");
        }

        if(height < 1.80) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }

        if(firstNameLetter == 'M') {
            System.out.println("Первая буква имени " + firstNameLetter);
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква имени " + firstNameLetter);
        } else {
            System.out.println("Первая буква имени " + firstNameLetter);
        }
    }
}