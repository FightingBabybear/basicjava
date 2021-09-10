package september.one.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/1 001 15:39
 * @description：
 * 创建两个分线程，其中一个线程遍历100以内的偶数，另一个编程100以内的奇数
 *
 *
 *
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class ThreadDemo {
    public static void main(String[] args) {

//        MyThread1 m1 = new MyThread1();
//        MyThread2 m2 = new MyThread2();
//        m1.start();
//        m2.start();
        //创建Thread类的匿名子类



        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 ==0){
                        System.out.println(Thread.currentThread().getName()+"O"+i+" **");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i % 2 !=0){
                        System.out.println(Thread.currentThread().getName()+i+" **");
                    }
                }
            }
        }.start();

    }
}



class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+"O"+i+" **");
            }
        }
    }
}

class MyThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 !=0){
                System.out.println(Thread.currentThread().getName()+i+" **");
            }
        }
    }
}