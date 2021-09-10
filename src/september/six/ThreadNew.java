package september.six;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/6 006 16:48
 * @description：
 *
 * Callable接口  JDK5.0新增
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class ThreadNew {
    public static void main(String[] args) {
        NumThread n1 = new NumThread();

        FutureTask futureTask = new FutureTask(n1);


        new Thread(futureTask).start();


        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}


class NumThread implements Callable {

    @Override
    public Object call()  throws Exception{
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
//                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
