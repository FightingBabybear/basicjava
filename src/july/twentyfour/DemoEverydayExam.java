package july.twentyfour;
/*
*
* 前++
* 后++
*
* */


public class DemoEverydayExam {
    public static void main(String[] args) {
//定义三个int变量，获取三个数中的较大值
        int a = 10;
        int b = 20;
        int c = -20;
        int max1 = (a>b)?a:b;
        int max2 = (max1>c)?max1:c;
        System.out.println(max2);
//--------------------------------
        //声明两个double变量，判断第一个数大于10.0 且第二个数小于20.0，打印两数和，否则打印两数乘积

        double x,y;
        x = 11;
        y = 2;
        if(x>10&&y<20){//自动类型提升
            System.out.println(x+y);
        }else {
            System.out.println(x*y);
        }
//--------------------------------

        int m,n,c1;
        m = 10;
        n = 23;
        System.out.println(m);
        System.out.println(n);
        c1 = m;
        m = n;
        n= c1;
        System.out.println(m);
        System.out.println(n);

    }

}
