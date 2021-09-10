package august.twelve;

public class Exer3Test {
    public static void main(String[] args) {

        Exer3Test test = new Exer3Test();

//        test.method;

        System.out.println(test.method());


    }


//public void method(){
//    for (int i = 0; i < 10; i++) {
//        for (int i1 = 0; i1 < 8; i1++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//}
//


    public int method(){
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 8; i1++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 10*8;
    }



}


