package august.seventeen.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 21:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Cylinder extends Circle{
    private double length;//高

    public Cylinder() {
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume(){
        //return Math.PI * getRadius()* getRadius()*getLength();
        return findArea() * length;
    }
}
