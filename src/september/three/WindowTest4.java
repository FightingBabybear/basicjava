package september.three;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/3 003 19:53
 * @description：
 *
 * 同步方法 继承
 * @modified By：
 * @version: $
 */
class Window4 extends Thread{
    //存在线程安全问题
    private static int ticket = 100;
    private static Object obj  = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (Window.class/*obj*/){
            show();
    }


    }



    private static synchronized void show(){//方法静态 Window4.class

        if(ticket > 0 ){
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




public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("线程1");
        w2.setName("线程2");
        w3.setName("线程3");

        w1.start();
        w2.start();
        w3.start();

    }
}
