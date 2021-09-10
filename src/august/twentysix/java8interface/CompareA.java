package august.twentysix.java8interface;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/26 026 20:52
 * @description：
 *
 * 静态方法  和 默认方法
 *
 * @modified By：
 * @version: $
 */
public interface CompareA {
//静态方法
public static void method1(){
    System.out.println("北京");//静态方法
}
//默认方法 需要对象调
public default void method2(){
    System.out.println("上海123");//默认方法
}

default void method3(){
    System.out.println("上海");
}

void method4();

}
