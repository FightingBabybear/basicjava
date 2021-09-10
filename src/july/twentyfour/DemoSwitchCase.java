package july.twentyfour;

/*
* switch中的表达式 只能是6种
* byte short char int 枚举（JDK5.0) String(JDK7.0)
*case后只能声明常量
* default 其他都不执行
*
* 凡是switch-case 都可以换为if-else 反之不成立
* */
public class DemoSwitchCase {
    public static void main(String[] args) {
    int asss = 1;

    int num = 8;
    switch (num){

        case 9:
            asss += 10;

        case 8:
            asss += 10;

        case 7:
            asss += 10;

        case 6:
            asss += 20;

    }
        System.out.println(asss);
    }

}
