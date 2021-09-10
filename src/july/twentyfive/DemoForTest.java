package july.twentyfive;

/*
*https://www.bilibili.com/video/BV1Kb411W75N?p=114&spm_id_from=pageDriver
* 输入两个正整数m和n,求其最大公约数和最小公倍数
* 比如：12和20的最大公约数是 4  最小公倍数是60
*
* 说明break关键字的使用
*
* */
public class DemoForTest {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("输入第一个正整数");
//        int M = scan.nextInt();
//
//        System.out.println("输入第二个正整数");
//        int N = scan.nextInt();
//
//        //获取两个数中较小值
//        int MIN = (M <= N) ? M : N;
//        //求最小公约数
//        for (int i = MIN; i >= 1; i--) {
//            if(M%i == 0 && N%i == 0){
//                System.out.println(i);
//                break;
//            }
//        }
//
//        int MAX = (M <= N) ? N : M ;
//        for (int i = MAX; i < M * N; i++) {
//            if(i%M==0&&i%N==0){
//                System.out.println(i);
//                break;
//            }
//        }

        //股票投资
        int sum  = 150000;
        for (int i = 0; i < 10; i++) {
            sum *= 1.04;
        }
        System.out.println(sum);
    }
}
