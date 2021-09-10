package july.twentysix;
/*
* while 循环用法:
* 初始化条件 (先执行一次)
* 循环条件--boolean类型
* 循环体
* 迭代条件
*
* 二.while循环的结构
* 初始化条件
* while(循环条件){
*   循环体
*   迭代条件
* }
*
* */

public class DemoWhile {
    public static void main(String[] args) {

        int i = 1;
        while (i<5){

            if(i%2 == 0){
                System.out.println(i);
                break;
            }
            i++;

        }



    }
}
