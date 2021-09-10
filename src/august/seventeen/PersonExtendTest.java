package august.seventeen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 17:39
 * @description：
 * @modified By：
 * @version: $
 *
 * 面试题：区分方法的重载和重写
 *
 *重写的规定:
 *  1.权限修饰符 返回值类型 方法名（）{
 *
 *  }
 * 约定俗成：子类中叫重写的方法 父类中叫被重写的方法
 *
 * 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同（重写时形参必须和父类的形参相同）
 *重写方法的权限修饰不小于父类被重写的方法
 *      特殊情况，子类不能重写父类中private的方法
 *     返回值类型:
 *          被重写返回值类型是void,重写的也只能是void
 *          父类被重写的返回值类型是A类，重写的方法可以是A及其子类
 *              父类被重写的返回值类型是基本数据类型，则重写必须是相同的基本数据类型 double double
 *     static不能被重写
 */
//https://www.bilibili.com/video/BV1Kb411W75N?p=274&spm_id_from=pageDriver
public class PersonExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();
        p1.sleep(2);

        Student s1 = new Student("jisuanji ");
        s1.eat();
        A ss = new A();
        ss.eat();
        s1.sleep();


        System.out.println(s1.major);
    }
}
