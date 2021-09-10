package august.thirty;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/30 030 19:56
 * @description：
 *
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *3.1 如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法不能使用throws
 * 意味着如果子类重写的方法有异常，必须使用try-catch-finally
 *
 * 3.2 执行的方法中，先后调用了另外几个方法啊，这几个方法是递进关系执行
 * 建议使用throws
 *而执行方法a可以考虑使用try-catch-finally方法进行处理
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class OverrideTest {


    public static void main(String[] args) {
        display(new SubClass());


    }


public static void display(SuperClass s){
    try {
            s.method();
    }catch (IOException E){
        E.printStackTrace();
    }

}

}


class SuperClass{
    public void method() throws IOException{

    }
}
class SubClass extends SuperClass{

    public void method() throws FileNotFoundException{

    }

}