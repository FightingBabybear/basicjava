package july.twentythree;
/*
* 适用于booleab型
* &逻辑与
* &&
* */
public class Demo_逻辑运算符 {
    public static void main(String[] args) {

        //区分& 和 &&
        //运算结果相同
        //当左边是false时，
        boolean b1 = true;
        int num1 =10;
        if(b1 & (num1++ >0)){

            System.out.println("100");
        }else {
            System.out.println("200");
        }


        boolean b2 = true;
//        b2 = false;
        int num2 =10;
        if(b2 && (num2++ <0)){

            System.out.println("100");
        }else {
            System.out.println("200");
        }


        //------------------------------
        //| ||


        boolean b3 = true;
        int num3 =10;
        if(b3 | (num3++ <0)){

            System.out.println("100");
        }else {
            System.out.println("200");
        }


        boolean b4 = true;
//        b4 = false;
        int num4 =10;
        if(b4 || (num4++ <0)){

            System.out.println("100");
        }else {
            System.out.println("200");
        }

    }

}
