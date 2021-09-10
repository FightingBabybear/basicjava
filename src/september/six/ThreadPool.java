package september.six;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/6 006 20:18
 * @description：
 *
 * 创建线程的方式4 使用线程池
 *
 *
 * @modified By：
 * @version: $
 */
public class ThreadPool {
    public static void main(String[] args) {
        //ExecutorService是一个接口
        ExecutorService e1 = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service = (ThreadPoolExecutor) e1;
        //设置线程池的属性
        System.out.println(e1.getClass());//class java.util.concurrent.ThreadPoolExecutor
        service.getPoolSize();


        e1.execute(new NumberThread());//适用于Callable
        e1.execute(new NumberThread1());//适用于Callable
//        e1.submit() 适用于Callable
//关闭连接池
        e1.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}