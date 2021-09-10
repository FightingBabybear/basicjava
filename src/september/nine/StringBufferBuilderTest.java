package september.nine;

import org.junit.Test;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/9 009 14:37
 * @description：
 * @modified By：
 * @version: $
 */
public class StringBufferBuilderTest {

    /*
    *
    * String:不可变的字符序列  底层结构使用char[]存储
    * StringBuffer：可变的字符序列  线程安全的 效率低
    * StringBuilder:可变的字符序列  线程不安全的，效率高 JDK5.0新增
    *
    * */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length());//0
    }
}
