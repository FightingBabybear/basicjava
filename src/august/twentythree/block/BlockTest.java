package august.twentythree.block;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 21:18
 * @description：
 * 代码块（初始化快） 比构造器还早执行
 *
 * 作用： 用来初始化类、对象
 * 如果有修饰只能用static修饰
 * 分类：
 *      静态代码块                                                   非静态代码块
 *     可以有输出语句                                               可以有输出语句
 *     随着类的加载而执行(类没有重新执行 就只有一次)                   随着对象的创建而调用
 *
 *
 * @modified By：
 * @version: $
 */
public class BlockTest {
    public static void main(String[] args) {

        String desc = Person.desc;

        Person p2 = new Person();
        Person p1 = new Person();

        Person.info();

    }
}



class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    //static静态代码块
    static{
        System.out.println("Hello static block");
    }

    //非静态代码块
    {
        System.out.println("hello block");

    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("eat");
    }

    public static void info(){
        System.out.println("我很快乐");
    }

}