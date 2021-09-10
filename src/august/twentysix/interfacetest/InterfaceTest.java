package august.twentysix.interfacetest;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/26 026 16:01
 * @description：
 * 1.接口使用interface定义
 * 2.java中，接口和类是并列的结构
 * 3.定义接口  定义接口中的成员
 *      3.1 JDK7及以前
 *          public static final  全局常量  可以省略
 *          public abstract
 *
 *      3.2 JDK8
 *          除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *
 * 4.接口中不能定义构造器、意味着接口不可以实例化
 *
 * 5.java开发中，接口通过类去实现（implements）
 *
 * 6.java类可以实现多个接口 --->弥补了单继承的局限
 *
 * 7.接口与接口之间 可以多继承
 *
 * 8.接口的具体使用，可以体现多态性
 * @modified By：
 * @version: $
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Bullet b = new Bullet();

        b.attack();
        System.out.println(Flyable.MIN_SPEED);

    }
}
//todo https://www.bilibili.com/video/BV1Kb411W75N?p=358&spm_id_from=pageDriver
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 790;
    int MIN_SPEED = 1;//等效public static final int MIN_SPEED = 1;
//    Plane MIN_SPEED = new Plane();//等效public static final int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();

    void stop();//省略public abstract
}

interface Attackable{
    void attack();

}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public String toString() {
        return "Plane{}";
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}


abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }
}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}