package september.five;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/5 005 13:38
 * @description：
 *
 * Lock锁  JDK5.0新增
 *
 * synchronized 与lock的异同
 * 同:都解决线程安全问题
 * 异：lock手动锁定，手动解锁
 *    synchronized 执行完相应的同步代码以后，自动释放同步监视器
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class LockTest {
    public static void main(String[] args) {

        Window w  = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Window implements Runnable{
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true){
            //调用lock()方法
            lock.lock();
            try {
                if(ticket > 0 ){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖票"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                //解锁方法
                lock.unlock();
            }

        }
    }
}