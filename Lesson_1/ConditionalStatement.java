public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 32;
        if(age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        }

        boolean maleGender = true;
        if(maleGender) {
            System.out.println("Мужской пол");
        }

        if(!maleGender) {
            System.out.println("Женский пол");
        }

        float height = 2.1f;
        if(height < 1.80) {
            System.out.println("Низкий");
        } else {
            System.out.println("Высокий");
        }

        char firstNameLetter = 'M';
        if(firstNameLetter == 'M') {
            System.out.println("Первая буква имени " + firstNameLetter);
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква имени " + firstNameLetter);
        } else {
            System.out.println("Первая буква имени " + firstNameLetter);
        }
    }
}