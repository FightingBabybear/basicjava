package july.twentyfour;
/*
* 循环四要素
* 初始化条件 (先执行一次)
* 循环条件
* 循环体
* 迭代条件
*for(初始化条件;循环条件;迭代条件) {
* 循环体}
* */
public class DemoForCycle {
    public static void main(String[] args) {

        for(int i = 1;i < 6 ;i++){
            System.out.println("Hello World");
        }
//练习
        int num = 1;
        for(System.out.println('a');num <= 3; System.out.println('c'),num++){

            System.out.println('b');
        } //abcbcbc

        //求0-100之间偶数的和
        int sum = 0;
        for(int i = 1;i<=100;i++)
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        System.out.println(sum);
    }

}
//https://www.bilibili.com/video/BV1Kb411W75N?p=111&spm_id_from=pageDriver