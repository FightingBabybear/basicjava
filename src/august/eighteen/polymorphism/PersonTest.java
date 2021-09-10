package august.eighteen.polymorphism;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/18 018 21:45
 * @description：
 * @modified By：
 * @version: $
 *
 * 多态性：
 * 理解为一个事物的多种形态
 *
 *何为多态性：
 * 子类对象的多态性：父类的引用指向子类的对象
 *
 *多态的使用：
 *      虚拟方法调用
 *      有了对象的多态性以后，在编译器，只能调用父类声明的方法，在运行期，实际执行子类重写的方法
 *
 *使用前提：
 *   1.有继承
 *   2.方法的重写
 *
 *为什么要有多态性
 *
 *
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //************************
    //子类对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();

        Person p3 = new Woman();

//当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法
        p2.eat();
//        p2.earnMoney(); 无效 只能用父类方法，如果父类被重写，就用重写的
        p2.sleep();


    }

}
