package july.twentytwo;
/*
* 前提:讨论包含7种基本数据类型 不包含boolean类型
* 1.自动类型提升
*小转大  自动提升为容量大的数据类型（表示数的范围的大和小）
* byte --> short --> int --> long --> float --> double
*有char、byte、short类型的运算，转换为int类型
*
* 2.强制类型转换
* 1.需要使用强转符：()
* 2.可能导致精度损失
* */
public class Demo03_基本数据类型之间的运算规则 {
    public static void main(String[] args) {
        byte b1 =12;
        int i1 = 2;
        //byte b2 = b1+i1 编译不通过
        int i2 = b1 +i1;
        System.out.println(i2);
//        float f = b1+i1;
//        System.out.println(f);    f:14.0

        char c1 = 'a'; //97 转换成ACSII码 为int
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

        //自动类型转换 (损失精度)
        double b = 12.3;
        int i8 = (int)b;
        System.out.println(i8);
//int转换成long
        long l = 12;
        System.out.println(l);
//    float f1 =12.3 //报错 大往小转
        //整型常数 默认类型为int
        //浮点型常数 默认类型为double
        byte b8 =12;
        int i5 = b8 + 1;
        System.out.println(i5);

    }
}
