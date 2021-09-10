package august.nineteen;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/19 019 20:32
 * @description：
 * @modified By：
 * @version: $
 *
 * //有了对象的多态性以后，内存上实际加载了子类特有的属性和方法，
 * 编译时，只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用
 *
 * 调用子类特有的属性和方法
 * 使用强制类型转换符 向下转型
 * Man m1 = (Man)p2
 *
 * instanceof关键字使用 :
 *  a instanceof A 判断对象a是否是类A的实例
 *  如果是，返回true 如果不是返回false
 *
 * 使用情景：为避免向下转型时出现异常，在向下转型之前，先进行instanceof 判断
 * a instanceof A 则  a instanceof B
 *
 */
public class Demo {
    //todo https://www.bilibili.com/video/BV1Kb411W75N?p=290&spm_id_from=pageDriver
}
