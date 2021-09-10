package september.one.test;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/1 001 15:59
 * @description：\
 * 测试Thread中的常用方法
 * 1.start启动当前线程
 * 2.run
 * 3.currentThread返回当前代码的线程
 * 4.getname() 获取当前线程的名字
 * 5.setname() 设置当前线程的名字
 * 6.yield()方法 释放当前线程 又马上抢回去
 * 7.join()方法 在线程a中调用线程b的join() 此时线程a进入阻塞状态。直到调用者执行完，再执行
 * 8.sleep() 读时间执行
 *
 * 线程优先级：
 * MAX_PRIORITY = 10
 * MIN_PRIORITY = 1;
 *
 * getPriority() 获取线程的优先级
 * setPriority(int p)设置线程的优先级
 *
 *
 *////  2021/9/1 001  done 多窗口卖票 https://www.bilibili.com/video/BV1Kb411W75N?p=423&spm_id_from=pageDriver
// *
// * @modified By：
// * @version: $
// ***////

class HelloThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"11");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public HelloThread(String name) {
        super(name);
    }

    public HelloThread() {
    }
}



public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread();
        h1.setName("线程一");
        h1.start();

        new HelloThread("线程二"){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"12");
            }
        }.start();
        System.out.println(h1.isAlive());
        h1.setPriority(5);
        h1.setPriority(Thread.MAX_PRIORITY);
    }
}
