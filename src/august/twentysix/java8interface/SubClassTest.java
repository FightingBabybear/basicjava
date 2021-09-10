package august.twentysix.java8interface;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/26 026 20:55
 * @description：
 * @modified By：
 * @version: $
 */
public class SubClassTest {


    public static void main(String[] args) {

        SubClass s  = new SubClass();
        s.method2();
        s.method3();

        //接口中定义的静态方法，只能通过接口来调用(像工具类 类名.方法 static)
        CompareA.method1();
        s.myMethod("as");

    }
}


//多继承 接口中存在同名同参的默认方法 需要重写方法 防止冲突 (接口名.super.fangfaming)
class SubClass extends SuperClass implements CompareA{

    //实现类重写了接口中的默认方法 调用时，调用重写后的方法

    public void method2(){
        System.out.println("123");
    }

    public void method2(String a){
        System.out.println("123"+a);
    }


    @Override
    public void method4() {

    }

    public void myMethod(String as){
        method2(as);
        super.method3();
        CompareA.super.method2();//



    }
}
