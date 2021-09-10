package august.seventeen.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 21:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }



}
