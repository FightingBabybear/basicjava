package august.twentythree.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 20:04
 * @description：
 * @modified By：
 * @version: $
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acct1 = new Account();
        Account acct2 = new Account("123456",50);

        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct2.getPwd());
        System.out.println(acct2.getBalance());
        System.out.println(Account.getInterestRate());


    }
}
