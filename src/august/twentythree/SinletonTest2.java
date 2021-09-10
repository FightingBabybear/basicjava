package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 20:43
 * @description： 懒汉式单例
 *
 * 好处： 1.延迟对象的创建
 * 坏处：线程不安全
 *
 * @modified By：
 * @version: $
 */
public class SinletonTest2 {
}


class Order{

    //1.私有化类的构造器
    private Order(){

    }

    //2.
    private static Order instance = null;

    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }

        return instance;
    }



}
