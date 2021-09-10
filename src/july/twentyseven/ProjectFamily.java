//package July.twentyseven;
//
///*
//*
//* https://www.bilibili.com/video/BV1Kb411W75N?p=134&spm_id_from=pageDriver
//* */
//import java.util.Scanner;
//
//public class ProjectFamily {
//    public static void main(String[] args) {
//
//
//        Scanner scan = new Scanner(System.in);
//        //  用于记录收支情况
//        String detail = "";
//        //初试金额
//        int balance = 100;
//
//        label:while (true){
//            int num = scan.nextInt();
//            System.out.println("-----------家庭收支记账软件----------");
//            System.out.println("             1.收支情况");
//            System.out.println("             2.登记收入");
//            System.out.println("             3.登记支出");
//            System.out.println("             4.退    出\n");
////            System.out.println();
//            System.out.print("             请选择<1-4>");
//
//      //todo      char selection = Utility1.readMenuSelection();
//
//            //todo  switch (selection){
//            //todo    case '1':
//                    System.out.println("-----当前收支明细记录--");
//                    System.out.println("收支\t账户金额\t收支金额\t说明\t");
//                    System.out.println(detail);
//                    System.out.println("-------------------------------");
//                    break ;
//
//            //todo  case '2':
//                //登记收入
//                    System.out.println("登记收入");
//                    System.out.print("本次收入金额：");
//            //todo      int money = Utility1.readNumber();
//                    System.out.print("本次收入说明");
//            //todo     String info =Utility1.readString;
//            //todo      balance +=money;
//
//                    //处理detail
//            //todo           detail += "收入\t"+ balance + "\t" + money +"\t" + info + "\n";
//
//                    System.out.println("---------登记完成---------");
//                    break ;
//            //todo case '3':
//                    System.out.println("本次支出金额");
//            //todo        int money1 = Utility1.readNumber();
//                    System.out.print("本次收入说明");
//            //todo        String info1 =Utility1.readString;
//            //todo         if(balance >= money1 ){
//            //todo        balance -= money1;
//                        detail += "收入\t"+ balance + "\t" + money1 +"\t" + info + "\n";
//                    }else {
//                        System.out.println("支出超出账户额度");
//                    }
//
//                    System.out.println("---------登记完成---------");
//                    break ;
//            //todo   case '4':
//                    System.out.println("是否确认退出（Y/N）");
//                    char isQuit = Utility1.readConfirmSelection();
//                    if(isQuit == 'Y' || isQuit == y){
//                        break label;
//                    }
//
//
//
//
//            }
//
//
//
//
//
//        }
//
//
//
//    }
//}
