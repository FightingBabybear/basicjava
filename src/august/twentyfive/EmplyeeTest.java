package august.twentyfive;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/25 025 21:18
 * @description：
 * @modified By：
 * @version: $
 */
public class EmplyeeTest {
    public static void main(String[] args) {


        Employee m1 = new Manager("库克",111,23,234);
        m1.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

        Employee m2 = new Employee() {//匿名子类
            @Override
            public void work() {

            }
        };

    }
}
