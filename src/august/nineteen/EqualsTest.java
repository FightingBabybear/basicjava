package august.nineteen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/19 019 21:38
 * @description：
 * @modified By：
 * @version: $
 *
 * 面试题  == 和 equals 的区别
 *
 * ==回顾
 * 1.可以使用在基本数据类型和引用数据类型
 * 基本数据类型:比较数值
 * 引用数据类型：比较地址值
 *
 *equals方法的使用
 * 1.是一个方法，非运算符
 * 2.只能适用于引用数据类型
 *
 *
 *像String Date File  包装类都重写了equals方法
 * 重写以后，比较的不是两个引用地址是否相同，而是比较两个对象的实体内容是否相同
 *
 * 通常情况下，使用equals 的话，也通常是比较两个对象的实体内容
 * 需要重写equals方法
 *//// TODO: 2021/8/19 019  https://www.bilibili.com/video/BV1Kb411W75N?p=299&spm_id_from=pageDriver
 ////
public class EqualsTest {
    public static void main(String[] args) {
        //https://www.bilibili.com/video/BV1Kb411W75N?p=301&spm_id_from=pageDriver
        int i =10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true 自动类型转换

        //**************************
        Customer p1 = new Customer("tOM",21);
        Customer p2 = new Customer("tOM",21);
        System.out.println(p1 == p2);//false


        System.out.println(p1.equals(p2));//false

        String in = new String();
        String in1 = new String();
        System.out.println(in.equals(in1));//true
        Customer c = new Customer("Tmo",21);
        System.out.println(c);
    }


}
