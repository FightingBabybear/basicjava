package august.twentythree;

import org.junit.Test;


/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 14:30
 * @description：
 * @modified By：
 * @version: $
 */
public class InterviewTest {

        @Test
        public void test1(){
            java.lang.Object o1 = true?new Integer(1):new Double(2.0);
            System.out.println(o1);//1.0 三元运算符自动类型提升

        }

        @Test
        public void test2(){
            java.lang.Object o2;
            if(true)
                o2 = new Integer(1);
            else
                o2 = new Double(2.0);
            System.out.println(o2);//1
        }


        @Test
    public void test3(){
            Integer i = new Integer(1);
            Integer j = new Integer(1);
            System.out.println(i == j );//false

            Integer m = 1;
            Integer n = 1;
            System.out.println(m == n);//true

            Integer x = 128;
            Integer y = 128;
            System.out.println(x == y);//false -128 ~ 127






        }


}
