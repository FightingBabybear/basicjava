package september.six.commonclass;

import org.junit.Test;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/6 006 20:45
 * @description：
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class StringTest {
    /*
    *
    */// https://www.bilibili.com/video/BV1Kb411W75N?p=454&spm_id_from=pageDriver


    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

    }

    @Test
    public void test2(){
        //此时的s1和s2的数据声明在方法区中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";

        //此时的s3、s4的数据在堆空间中
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//t
        System.out.println(s1 == s3);//f
        System.out.println(s1 == s4);//f
        System.out.println(s3 == s4);//f
    }












/*
* String 字符串 使用一对"引号来表示
* 1.String声明为final
* 2.实现Serializable接口 表示支持序列化 （对象是可以传输的）
*       Comparable接口 可以比较大小
* 3.String内部定义了final char[] value用于存储字符串数据
* 4.String;代表一个不可变的字符序列 不可 变性
*
* 通过字面量的方式给一个字符串赋值，此时的字符串值声明在字符串常量池中
* 字符串常量池中是不会存储相同内容的字符串的
*
*
* */

    @Test
    public void test1(){
        String s1 = "abc";//字面量（不new）
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);// 在地址值中是同一个 true
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        System.out.println("******************");
        //进行连接操作时，也会重新制定新的区域
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);//abcdef

        System.out.println(s2);//abc  s3是新造的

        System.out.println("**************");

        String s4 = "abc";
        String s5 = s4.replace("a", "m");
        System.out.println(s4);//abc s4未变
        System.out.println(s5);//mbc 又重新开闭一块空间



    }

}
