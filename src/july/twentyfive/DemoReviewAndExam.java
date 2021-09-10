package july.twentyfive;


/*
* 1.switch 后面可以是哪些数据类型？
*byte short char int 枚举 String
*
*2.谈谈你对三元运算符，if-else /switch-case结构使用场景的理解
* 答：三元和switch-case效率稍微高点
* 三元运算符容易出现空指针异常
*
*3.从控制台获取String 和int变量
* import java.util.Scanner;
* Scanner xx = new Scanner(System.in)
* xx.方法
*
*
*
* */

public class DemoReviewAndExam {
    public static void main(String[] args) {
//        int a = 3;
//        int x = 100;
//        switch (a){
//            case 1:
//                x += 5;
//                break;
//            case 2:
//                x += 10;
//                break;
//            case 3:
//                x += 16;
//                break;
//            default:
//                x += 16;
//                break;
//        }
//        System.out.println(x);

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
