package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 14:23
 * @description：
 * @modified By：
 * @version: $
 */
public class WrapperTest {

    public void test1(){

        int num1 = 10;
        String st1 = num1 + "";
        System.out.println(st1);

        float f1 = 12.3f;
        String st2 = String.valueOf(f1);
        System.out.println(st2);

        //String 变基本数据类型/包装类
        String st3 = "123";
        int i4 = Integer.parseInt(st3);
        System.out.println(i4+1);



    }

    public static void main(String[] args) {

        WrapperTest w1 = new WrapperTest();
        w1.test1();


    }

}
