package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 19:52
 * @description：
 * @modified By：
 * @version: $
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);

        System.out.println("C1" + c1.getId());
        System.out.println("C2" + c2.getId());
        System.out.println("C3" + c3.getId());

        System.out.println("创建的圆的个数为"+Circle.getTotal());



    }
}



class Circle{
    private double radius;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
//        id = init++;
//        total++;
    }

    private static int total;
    private static int init = 1001;

    public double findArea(){
        return 3.14 * radius * radius;
    }


}