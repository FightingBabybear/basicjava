package august.seventeen.exer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/17 017 21:28
 * @description：
 * @modified By：
 * @version: $
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();


        cy.setRadius(2.1);
        cy.setLength(3.4);
        System.out.println(cy.findVolume());

        System.out.println(cy.findArea());



    }
}
