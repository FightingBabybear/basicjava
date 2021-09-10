package september.two.runnable;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/2 002 13:56
 * @description：
 * 通过同步机制，解决线程的安全问题
 *
 *synchronized synchronized synchronized
 * synchronized(同步监视器){
 *     //需要被同步的代码
 * }
 * 说明： 操作共享数据的代码，即为需要被同步的代码
 *      共享数据：多个线程共同操作的变量
 *      同步监视器 ，俗称锁 任何一个类的对象，都可以充当锁
 *      要求：多个线程必须要共用同一把锁
 *
 * @modified By：
 * @version: $
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();
        //只造了一个对象，共用100张 不需要static
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}


class Window implements Runnable{
    private int ticket = 100;
//    Object obj = new Object();


    @Override
    public void run() {
//        Object obj = new Object();//此时线程不安全 一个线程一个锁，锁不共用
        while (true){
//            synchronized (obj){
            synchronized (this){//此时的this代表唯一的对象
                if(ticket > 0 ){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "：卖票，票号为"+ticket);
                ticket--;
            }else {
                break;
            }}

//            if(ticket > 0 ){
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "：卖票，票号为"+ticket);
//                ticket--;
//            }else {
//                break;
//            }
        }
    }
}
