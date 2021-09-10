package august.eighteen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/18 018 17:08
 * @description：
 * @modified By：
 * @version: $
 *
 * super 可以调属性、方法、构造器
 *属性是不会覆盖的
 */
public class Student extends Person {

    String major;
    String id = "1002";


    public Student(String major) {
        this.major = major;
    }

    public Student() {
//默认调用空参构造器
    }

    public void show(){
        System.out.println(name + age + super.id);
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Student(String name, String major) {
        super(name); //必须声明在子类构造器的首行
        this.major = major;
    }


}
