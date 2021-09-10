package august.twelve;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 10.20;
        System.out.println(c1.findArea());


    }
}


class Circle{
    //属性
    double radius;




    //方法
    public double findArea(){
        double area = Math.PI * radius *radius;
        return area;
    }




}