package july.twentythree;

/*
* 赋值运算符
* 符号：=
* 当两侧数据类型不一样时，自动类型转换或者强转
* 支持连续赋值
*
* */
public class Demo_赋值运算符 {

    int b = 50;
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        a = 10;
        b = 20;
        b=c=10;//连续赋值
        System.out.println(b);
//
        int num2 = 2;
        int num1 = 10;
        num2 += num1;
        System.out.println(num2);//12

        //开发中，实现+2的操作
//        int i1 = 10;
//        1.i1 + = 2; //不改变数据类型 推荐使用
//        2.i1 = i1 + 2


    }
}
