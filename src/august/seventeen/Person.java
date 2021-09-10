package august.seventeen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 17:37
 * @description：
 * @modified By：
 * @version: $
 *
 * 如果没有显式的声明一个类的父类，则继承java.lang.Object类
 * 所有类都直接或间接继承于java.lang.Object类
 * 所有java类都具有Object类声明的功能
 *
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int time){
        System.out.println("睡觉" + time + "小时");
    }


}
