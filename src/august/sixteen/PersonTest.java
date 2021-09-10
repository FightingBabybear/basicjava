package august.sixteen;
/*
* this关键字使用
*修饰属性、方法、构造器
*
* 修饰属性、方法
* this 理解为当前对象 或者当前正在创建的对象
*this.属性 this.方法
*
*修饰构造器
*this(形参列表)
* 不能调自己
* n个构造器 最多n-1个构造器中使用了this(形参列表)
*构造器内部  最多 只能声明一个this(形参列表)
*
*
* */
public class PersonTest {
    public static void main(String[] args) {
//        Person p1 = new Person();

//        p1.eat();
        Person p2 = new Person("tMO");
        p2.study();
    }
}

class Person{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        this.eat();
    }

    public Person(String name) {
//        this();//只能写在第一行
//        this(name);//报错，不能调自己
//        this(age);//报错

        this.name = name;

    }

    public Person(String name, int age) {
        this(age);
        //this(age);//报错 非首行
        this.name = name;
        this.age = age;
    }


    public void eat(){
        System.out.println("吃饭");
        this.study();
    }
    public void study(){
        System.out.println("学习");
    }



}
