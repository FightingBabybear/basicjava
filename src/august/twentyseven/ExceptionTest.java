package august.twentyseven;

import org.junit.Test;

import java.util.Date;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/27 027 21:31
 * @description：
 *
 * java.lang.Error
 * java.lang.Exception 可以进行异常的处理
 *  编译时异常（checked）
 *      IOException
 *          FileNotFoundException
 *  运行时异常（unchecked）
 *
 *
 *  常见的异常有哪些 举例说明
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class ExceptionTest {


//ClassCastException
    @Test
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }





    //ArrayIndexOutException
    @Test
    public void test2(){

        int[] arr2 = new int[3];
        System.out.println(arr2[3]);//没有下标为3
    }





    //NULLPOINTERException
    @Test
    public void test1(){
//        int[] arr1 = null;
//        System.out.println(arr1[3]);
            String str = "abc";
            str = null;
        System.out.println(str.charAt(0));
    }




}
