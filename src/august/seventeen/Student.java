package august.seventeen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 17:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Student extends Person {

    String major;

    public  void study(){
        System.out.println("xuexi");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
}
