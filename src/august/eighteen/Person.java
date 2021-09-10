package august.eighteen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/18 018 17:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Person {

    String name;
    int age;
    String id = "1001";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
