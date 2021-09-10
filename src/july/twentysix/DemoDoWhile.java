package july.twentysix;
/*
初始化条件 (先执行一次)
* 循环条件--boolean类型
* 循环体
* 迭代条件

初始化条件
* do-while 循环结构：
* do{循环体
* 迭代条件
* }while(循环条件);
*
执行顺序  初始化条件 循环体  迭代条件  循环条件
* */
public class DemoDoWhile {
    public static void main(String[] args) {

    int num = 1;
    int sum = 0;
    int count =0;
    do{
        if(num % 2 == 0){
            System.out.println(num);
            sum +=num;
            count++;
        }

        ++num ;
    }while (num <= 100);
        System.out.println(num);
        System.out.println(sum);
        System.out.println(count);

    }

}
