package august.twelve;

public class PersonTest {
    public static void main(String[] args) {




        Person p1 = new Person();


        p1.name = "Tom";
        p1.age = 10;
        p1.sex = 1;

        p1.study();

        p1.showAge();
        int newage = p1.addAge(2);

        System.out.println(newage);

        Person p2 = new Person();
        p2.showAge();
    }
}
