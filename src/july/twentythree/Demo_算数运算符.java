package july.twentythree;

/*
* 算数运算符
* + - * / %（取余）   +（字符串连接）
* 赋值运算符
*
* 比较运算符
*
* 逻辑运算符
*
* 位运算符（开发中用的比较少）
*
* 三元运算符
*
* */
public class Demo_算数运算符 {
    public static void main(String[] args) {
                //算数运算符
        int a = 5;
        int b = 12;
        int result = b/a;
        System.out.println(result);//2

        double c = 2.0;
        System.out.println(b/c);//6.0 精度自动扩大

        System.out.println((double) b/a);//2.4
        System.out.println((double)result);//2.0


        //%：取余运算
        if(a%2==0){
            System.out.println("哇塞，今天我好漂亮，给你个机会夸夸我");
        }else {
            System.out.println("我是一个精通人性擅长让男人为我花钱的女讲师");
        }


        //前++  后++ 都是自增/*
        //注意
//        short s1 =10;
//        错误：s1 = s1 +1; //int
//        正确：s1 = (short)(s1 + 1);
//        s1++ 自增1 不会改变本身变量的数据类型
        //
        // */

        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1);//11
        System.out.println(b1);//11

        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2);//11
        System.out.println(b2);//10

        //特例 byte 溢出
        byte bb1= 127;
        bb1++;
        System.out.println(bb1);//-128
//        byte bb2= -128;
//        bb2--;
//        System.out.println(bb2);//127

    }
}
