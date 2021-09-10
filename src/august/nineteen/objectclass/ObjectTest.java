package august.nineteen.objectclass;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/19 019 21:27
 * @description：
 * @modified By：
 * @version: $
 * Object类是所有java类的根父类
 * 3.Object类中的功能（属性和方法）
 * clone() 复制一个对象
 * equal
 *  equals()  toString () getClass hashCode clone finalize
 *
 * 面试题： final finally finalize 的区别
 *
 *
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println(order.getClass().getSuperclass());



    }
}


class Order{

}