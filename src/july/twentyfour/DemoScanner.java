package july.twentyfour;

/*2021.7.24
* 导包
* Scanner 的实例化
*
* */

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {


        Scanner scor = new Scanner(System.in);
        int score = scor.nextInt();

        if(score >= 90){

            System.out.println("奖励宝马车");

        }else if(score >= 80 && score < 90){
            System.out.println("小明获得一部手机");
        }else if (score >= 60 && score < 80 ){

            System.out.println("面包");

        }else {
            System.out.println("什么都没有");
        }
//        Scanner ziliao = new Scanner(System.in);
//        System.out.println("请输入你的姓名");
//        String getName = ziliao.next();
//        System.out.println(getName);
//
//        System.out.println("请输入你的年龄");
//        int age = ziliao.nextInt();
//        System.out.println(age);
//
//        System.out.println("请输入你的体重");
//        double weight = ziliao.nextDouble();
//        System.out.println(weight);
//
//        System.out.println("是否吃饭？");
//        boolean isLove = ziliao.nextBoolean();
//        System.out.println(isLove);
//
//        //对于char型的获取，Scanner没有相关方法，只能获取一个字符串
//        System.out.println("输入男/女");
//        String gender = ziliao.next();
//        char genderChar = gender.charAt(0);
//        System.out.println(genderChar);
    }
}
