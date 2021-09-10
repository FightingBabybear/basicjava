package september.three;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/3 003 19:34
 * @description：
 * 使用同步方法来解决Runnable接口的线程安全问题
 * 方法下全是应操作数据 方法前面用synchronized
 *
 * @modified By：
 * @version: $
 */
public class WindowTest3 {
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



    @Override
    public void run() {
        while (ticket > 0){
            show();
        }
        }



    private synchronized void show() {
//        synchronized (this)
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：卖票，票号为" + ticket);
            ticket--;
        }
    }
}


