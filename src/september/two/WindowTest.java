package september.two;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/2 002 13:27
 * @description：
 *
 * 创建三个窗口卖票，总票数100张
 *1.问题：卖票过程中，出现重票，错票
 * 问题出现的原因:  争夺临界资源 执行的过程当中，其他线程进入
 * 当某个线程操作车票的过程中，尚未完成操作时，其他线程进入
 *
 * 解决方案： 当一个线程在操作ticket的时候，其他线程不能参与 直到线程A操作完ticket的时候
 * 线程才可以开始操作ticket，即使线程A出现了阻塞，也不能改变
 * (牺牲速度和性能)
 *
 * @modified By：
 * @version: $
 */
class Window extends Thread{
    //存在线程安全问题
    private static int ticket = 100;
    private static Object obj  = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (Window.class/*obj*/){ if(ticket > 0 ){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println(getName() + "：卖票，票号为"+ticket);
                ticket--;
            }else {
                break;
            }}

        }


    }
}




public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("线程1");
        w2.setName("线程2");
        w3.setName("线程3");

        w1.start();
        w2.start();
        w3.start();

    }
}
