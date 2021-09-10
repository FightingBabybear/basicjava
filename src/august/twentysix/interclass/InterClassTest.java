package august.twentysix.interclass;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/26 026 22:08
 * @description：
 * 1.java中允许将另一个类A声明在另一个类B中，则类A就是内部类 B称为外部类
 *
 * 2.内部类的分类; 成员内部类 vs 局部内部类（方法内，代码块内，构造器内）
 *成员内部类： 1.作为外部类的成员
 *                  可以被static
 *                  可以被4种不同权限的修饰
 *
 *            2.作为一个类       可以定义属性、方法、构造器
 *                          可以final 不使用fianl 就可以被继承
 *                          可以被abstract
 *
 *
 * @modified By：
 * @version: $
 */
public class InterClassTest {
    public static void main(String[] args) {
        //静态类
        Person.Bird a = new Person.Bird();

        //非静态类
        Person p1 = new Person();
        Person.Dog b = p1.new Dog();
        b.display("1");

    }
}


class Person{
    String name = "3";
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    class Dog{
        String name = "2";
        int age;

        public void show(){
            System.out.println("吃米");
            Person.this.eat();//调用外部类的结构

        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
    }


    static class Bird{
        public void show(){
            System.out.println("吃米");
//            eat();
        }

    }

    public void method(){
        class AA{

        }
    }

    {

        class BB{

        }

    }

    public Person() {
        class CC{


        }
    }
}