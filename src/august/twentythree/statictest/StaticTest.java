package august.twentythree.statictest;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 16:12
 * @description：
 * static关键字的使用
 *
 * 1.static 静态的
 * 2.static可以修饰 属性、方法、代码块、内部类   （不可以构造器）
 *
 * 3.static修饰属性:静态变量（类变量）
 *      属性按是否使用static修饰，分为 静态属性和非静态属性（实例变量）
 *
 *      1.静态变量随着类的加载而加载（早于对象的创建）
 *      2.静态变量的加载早于对象的创建
 *      3.由于类只加载一次 静态变量在内存中也只会存在一份
 *              存在方法区的静态域中
 *
 *      4.  类变量          实例变量
 *      类    yes            no
 *      对象  yes            yes
 *
 * 4.static修饰方法 静态方法
 *
 *      1.随着类的加载而加载。可以通过"类.静态方法”调用
 *      2.静态方法中，只能调用静态的方法或属性
 *          非静态中，既可以调用非静态 也可以调用静态
 *
 *
 *静态方法中，不可以用this和super
 *
 * 开发中，如何确定一个方法是否要声明为static?
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class StaticTest {
    public static void main(String[] args) {




        Chinese c1 = new Chinese();
        c1.name = "张三";
        c1.age = 21;


        Chinese c2 = new Chinese();
        c2.name = "李四";
        c2.age = 35;
        Chinese.setNation("zhongguo") ;

        //c1.nation = "CHN";
        System.out.println(c2.getNation());

        Chinese.show();
    }

}

class Chinese{
    String name;
    int age;
    static String nation;

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }

    public static void show(){
        System.out.println("我是中国人");
//        eat();不能调用非静态
    }

    public void eat(){
        show();//非静态方法可以调用静态方法
        System.out.println("吃东西");
    }
}
