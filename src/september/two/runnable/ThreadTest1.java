package september.two.runnable;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/2 002 13:46
 * @description：
 * 1.创建一个实现了runnable接口的类
 * 2.实现类去实现runnable中的抽象方法 run（）
 * 3.创建实现类的对象
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */

class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {

        //创建实现类的对象
        MThread mThread = new MThread();
        //将此对象作为参数传递到Thread类的构造器中
        Thread thread1 = new Thread(mThread);

        //通过Thread类的对象调用start() 1.启动线程 2. 调用run方法
        thread1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread thread2 = new Thread(mThread);
        thread2.start();
    }
}
