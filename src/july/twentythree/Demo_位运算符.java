package july.twentythree;
/*
* 使用频率低
* 要求能看懂就行
*
* */
public class Demo_位运算符 {
    public static void main(String[] args) {

        int I =21;
        System.out.println(I<<2); //左移两位 84
        System.out.println(I<<3); //左移三位 168 2的三次方
        System.out.println(I>>2); //右移二位  5

        //练习： 交换两个变量的值
        //方法1：临时变量
        int num1 = 10;
        int num2 = 20;
//        int c;
//        c = num1;
//        num1 = num2;
//        num2 = c;
//        System.out.println(num1);
//        System.out.println(num2);
        //方法2 ：好处：不用定义临时变量
        //弊端：1.有溢出风险 2. 有局限性：数值型
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println(num1);
//        System.out.println(num2);

        //方法3：位运算符
        //局限 只使用数值型
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
