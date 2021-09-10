package september.three;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/3 003 20:47
 * @description：
 * @modified By：
 * @version: $
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();

        System.out.println(b1);



    }
}


class Bank{

    private Bank(){

    }

    private static Bank instance = null;

    public static synchronized Bank getInstance(){ //Bank.class
        if(instance == null){
            instance = new Bank();
        }
        System.out.println(instance);
        return instance;
    }

}