package august.twentythree.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 20:04
 * @description：
 * @modified By：
 * @version: $
 */
public class Account {
    private int id;
    private String pwd = "000000";//初始密码
    private double balance;//存款余额

    private static double interestRate;//利率都一样
    private static double minMoney;//最小余额

    private static int init = 1001;//用于自动生成id

    public Account() {
        id = init++;
    }

    public Account(int id, String pwd) {
        this();
        this.id = id;
        this.pwd = pwd;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account(int id) {
        this();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
