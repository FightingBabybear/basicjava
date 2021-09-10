package september.one;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/1 001 15:15
 * @description：
 * 多线程的创建 方式一： 继续Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run() ---->将此线程的操作声明在run中
 * 3.创建Thread类的子类的对象
 * 4.调用start
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class ThreadTest {
    public static void main(String[] args) {
     //3.创建子类的对象
     MyThread t1 = new MyThread();//主线程做的



        for (int i = 0; i < 100; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+" *--");
            }
        }

        t1.start();//start方法自动调run
///        t1.start();//Exception in thread "main" java.lang.IllegalThreadStateException
        //不可以让已经start（）的线程去执行
        MyThread t2 = new MyThread();
        t2.start();

    }
}




class MyThread extends Thread{
    //重写run方法


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+" **");
            }
        }
    }
}
