package august.thirty;

import org.junit.*;

import java.io.File;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/30 030 17:22
 * @description：
 *
 * 像数据库连接、输入输出流、网络编程socket等资源，JVM是不能自动回收的，我们需要手动进行资源回收的
 * 此时的资源释放，需要声明在finally中
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class FinallyTest {


    @Test
    public void test2(){
        File file = new File("hello.txt");

        //https://www.bilibili.com/video/BV1Kb411W75N?p=418&spm_id_from=pageDriver



    }


@Test
public void test1(){
    try{
        int i = 10;
        int j = 0;
        System.out.println(i/j);
    }catch ( ArithmeticException e){
        e.printStackTrace();
    }
    finally {
        System.out.println("你好帅");
    }
}

@Test
public void methodTest(){
    int num = method();
    System.out.println(num);

    }

@Test
public int method(){

    try{
        int[] arr = new int[10];
        System.out.println(arr[10]);
        return 1;
    }catch (ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
        return 2;
    }finally {
        System.out.println("一定会执行");//先执行finally 再执行return
        return 3;//执行此return之后，其他return不再执行
    }
}


}
