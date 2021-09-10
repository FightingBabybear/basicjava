package july.twentythree;
/*
* 运算符之六：三元运算符
* 1.结构：（条件表达式）？表达式1：表达式2
* 2.条件表达式结果为boolean类型
* 根据表达式真或假 决定执行表达式1，还是表达式2
* true 执行表达式1
* false 执行表达式2
*
* 三元运算符可以嵌套
* if else 和三元运算符转换
* 凡是可以使用三元运算符的地方 都可以改写成if else
* 反之不成立
* */
public class Demo_三元运算符 {
    public static void main(String[] args) {

        int m = 12;
        int n = 5;

        int max = (m>n)?m:n;  //表达式类型需要统一成一个类型
        System.out.println(max);

        double num1 = (m>n)?2:1.0;
        System.out.println(num1);

        String num2 = (m>n)?"sasf":"123";
        System.out.println(num2);

        //获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -45;
        int max1 = (n1>n2) ?n1:n2;
        int max2 = (max1>n3)?max1:n3;
        System.out.println(max2);


    }
}
