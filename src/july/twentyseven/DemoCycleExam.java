package july.twentyseven;

import java.util.Scanner;

/*
* 题目 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束
*
*1.不在循环条件部分限制次数的结构，for(;;); while
*
* */
public class DemoCycleExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int zhengcount = 0;//记录正数 positive
        int fucount = 0;//记录负数 negative
//方法1
//        while (true){
//            int num = scan.nextInt();
//            //判断num正数
//            if(num<0){
//                fucount++;
//            }else if(num>0){
//                zhengcount++;
//            }else {
//                break;
//            }
//        }

//方法2
        for(;;){
            int num = scan.nextInt();
            //判断num正数
            if(num<0){
               fucount++;
            }else if(num>0){
                zhengcount++;
           }else {
                break;
           }
        }
        System.out.println(zhengcount);
        System.out.println(fucount);


    }
}
