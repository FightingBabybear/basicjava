package august.twentyfive;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/25 025 21:13
 * @description：
 * @modified By：
 * @version: $
 */
abstract public class Employee {
    private String name;
    private int id;

    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

}
