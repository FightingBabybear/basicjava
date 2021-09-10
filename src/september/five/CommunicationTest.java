package september.five;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/5 005 14:21
 * @description：
 * 使用两个线程打印1-100 线程一 线程二 交替打印
 *
 * 涉及的三个方法
 * wait 一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify一旦执行此方法，就唤醒被wait的一个线程，优先唤醒优先级高的
 * notifyALL 唤醒所有被wait的方法
 *
 * 前提：同步代码块或者同步方法里
 * 三个方法的调用者必须是锁
 * 默认this.xxx
 * 这三个方法是在java.lang.object下的
 *
 *
 * @modified By：
 * @version: $
 * // https://www.bilibili.com/video/BV1Kb411W75N?p=443&spm_id_from=pageDriver
 */
public class CommunicationTest {
    public static void main(String[] args) {

        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();

    }
}


class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (number <= 100){
//                    notifyAll();//全部唤醒
                    notify();
                    try {
                        //sleep不释放锁
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        //执行wait释放锁
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }

        }
    }
}