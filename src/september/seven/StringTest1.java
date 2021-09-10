package september.seven;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/7 007 20:40
 * @description：
 * 涉及到String类与其他结构之间的转换
 *
 * @modified By：
 * @version: $
 */
public class StringTest1 {








    /*
    量和常量的拼接在常量池

    * */
    @Test
    public void test4(){
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);//false

        final String s4 = "javaEE";//s4:常量
        String s5 = s4 + "hadoop";//常量和常量的拼接在常量池
        System.out.println(s1 == s5);//true
    }




    /*
    * String与byte[]
    * String-->byte[] 调用String的getBytes
    * byte[]-->String
    * */
    @Test
    public void test3(){
        //编码
        String str1 = "abc123zx";
        byte[] bytes = str1.getBytes();
        System.out.println(bytes);
        System.out.println(Arrays.toString(bytes));


        //解码
        String s = new String(bytes);
        System.out.println(s);


    }





    /*
    *
    * String 与 char[]
    *
    * String -->char[] 调用String的toCharArray()
    * char[]-->String 调用String的构造器
    * */
    @Test
    public void test2(){
        String str1 = "abc123";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }







/*
*
* String与基本数据类型、包装类的转换
*String-->基本数据类型、包装类 parseInt
* 基本数据类型、包装类-->String valueOf(xxx)
*
*
* */

    @Test
    public void test1(){
        String st1 = "123";
        int i = Integer.parseInt(st1);

        String str2 = String.valueOf(i);
        String str3 = i + ""; //在堆里

        System.out.println(st1 == str3);//false

    }


}
