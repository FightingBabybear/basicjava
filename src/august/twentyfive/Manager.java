package august.twentyfive;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/25 025 21:14
 * @description：
 * @modified By：
 * @version: $
 */
public class Manager  extends Employee{

    private  double  bonues;

    public Manager(String name, int id, double salary, double bonues) {
        super(name, id, salary);
        this.bonues = bonues;
    }

    public Manager() {
    }

    public Manager(double bonues) {
        this.bonues = bonues;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提供公司运行效率");
    }
}
