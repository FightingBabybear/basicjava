package august.nineteen;

import java.util.Objects;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/19 019 21:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
    //https://www.bilibili.com/video/BV1Kb411W75N?p=303&spm_id_from=pageDriver
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

  
}
