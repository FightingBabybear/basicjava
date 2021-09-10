package august.nine;
/*
*
*创建类的对象 = 类的实例化 = 实例化类
* 如果修改一个对象的属性a,不影响另外一个对象的属性a (非static)
*  */
public class PersonTest {
    public static void main(String[] args) {
    //创建Person类的对象
    Person person1 = new Person();

   Person person2 = new Person();
    //调用对象的结构 属性、方法
    //调用属性 ：对象.属性
    person1.name = "Tom";
        System.out.println(person1.name);

        //调用方法 对象.方法
        person1.eat();
        person1.talk("chinese");
//        System.out.println(person1);
//        System.out.println(person2);
        System.out.println(person2.name);
        System.out.println(person2.isMale);
    }
}

class Person{
    //属性 对应类中的成员变量 Field
    String name;
    int age;
    boolean isMale;


    //方法 对应类中的成员方法 Method
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }



    public void talk(String language){
        System.out.println("人可以说话，使用的是："+language);
    }

}