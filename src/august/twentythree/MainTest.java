package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 21:02
 * @description：  main方法的使用说明
 * 1.main()方法作为程序的入口
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class MainTest {
    public static void main(String[] args) {

        Main.main(new String[100]);


    }
}

class Main{

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            args[i] = "args" + i;
            System.out.println(args[i]);
        }



    }


}
