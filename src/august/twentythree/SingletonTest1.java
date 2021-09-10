package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 20:31
 * @description： 某个类只能存在一个实例
 * @modified By：
 * 好处：线程安全
 * 坏处： 对象加载时间过长
 *
 * @version: $
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        //Bank a = new Bank();

        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
    }
}



class Bank{
    //饿汉
    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象
    private static Bank instance = new Bank();

    //3.提供公共的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }


}
