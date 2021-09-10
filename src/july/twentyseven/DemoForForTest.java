package july.twentyseven;
/*
* 嵌套循环的使用
* 嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，构成了嵌套循环
* 外层控制行数
* 内层控制列数
* */

public class DemoForForTest {
    //******
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int row = scan.nextInt();
//        for (int i = 1; i <= row; i++) {
//            for (int i1 = 1; i1 <= i; i1++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        System.out.println("-------------------");


//        for (int i = 0; i < 5; i++) {
//            for (int i1 = 0; i1 < 5; i1++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //九九乘法表
//       int row = 9;
//        for (int i = 1; i <= row; i++) {
//            for (int i1 = 1; i1 <= i; i1++) {
//                System.out.print(i1+"*"+i+"="+ i*i1 +"\t");
//            }
//            System.out.println();
//        }

        //100以内所有质数
        //遍历100以内的自然数
//        boolean isFlag = true;
//        long start1 = System.currentTimeMillis();
//        for (int i = 2; i <= 10000; i++) {
//            //被i去除
//
//            for (int i1 = 2; i1 < i ; i1++) {
//                if(i%i1 == 0 ){
//                    isFlag = false;
//                }
//            }
//            if(isFlag == true){
//                System.out.println(i);
//            }
//
//            //重置
//            isFlag = true;
//        }
//        long end1 = System.currentTimeMillis();
//
//        System.out.println(end1 - start1);
//
//
//        //优化100以内的质数
//        boolean isF = true;
//        long start = System.currentTimeMillis();
//
//
//        for (int i = 2; i <= 10000; i++) {
//            //优化2 对本身是质数自然数有效
//            for (int i1 = 2; i1 <= Math.sqrt(i); i1++) {
//                if(i%i1 ==0){
//                    isF = false;
//                   // break;//只对非质数有效
//                }
//            }
//            if(isF == true){
//                System.out.println(i);
//            }
//            isF = true;
//        }

//优化3
        label:for (int i = 2; i <= 100; i++) {
            //优化3 对本身是质数自然数有效
                for (int i1 = 2; i1 <= Math.sqrt(i); i1++) {
                    if(i%i1 ==0){
                    continue label;
                }
            }

            System.out.println(i);
        }



//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
    }
}
