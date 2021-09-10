package august.fourteen;
/*
* 构造器（构造方法） constructor
*
* 作用：
* 1.创建方法
*
* 1.如果没有显示的定义类的构造器的话，系统默认提供一个空参的构造器
* 定义构造器格式 权限修饰符 类名（形参列表）｛｝
* 一个类中，至少有一个构造器
* */
public class PersonTest {
    public static void main(String[] args) {


        Person a = new Person();

        a.setAge(50);
        System.out.println(a.getAge());
//        a.age = 20;

        P aa = new P("Tom");
        P aa1 = new P();
//        aa1.setAge(50);
        System.out.println(aa.name);
        System.out.println(aa1.getAge());

    }
}
//https://www.bilibili.com/video/BV1Kb411W75N?p=233&spm_id_from=pageDriver
class P{
    //属性
    String name;
    int age;
//显式的定义了类的构造器后，系统不再提供默认的空参构造
     public P(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //构造器

    public P() {
        age = 18;
    }
//    public P(){
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public P(String n)
    {
        name = n;
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }







}
