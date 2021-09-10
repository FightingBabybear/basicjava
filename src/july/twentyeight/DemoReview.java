package july.twentyeight;
/*
* 一个数等于它的因子之和，这个数称为“完数”，例如 6= 1 + 2 + 3
*
* */

public class DemoReview {
    public static void main(String[] args) {
        int factor = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int i1 = 1; i1 < i/2; i1++) {
                    if(i % i1 == 0){
                        factor += i1;
                       // factor += i1 + i/i1; 根号
                    }

            }

            if(i == factor){
                System.out.println(i);
                ///continue;
            }

            //重置factor
            factor = 0;




        }
    }

}
