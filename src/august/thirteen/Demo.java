package august.thirteen;
/*
* 重载，在一个类中，允许存在同名的方法 Overload
*
* 跟方法的权限修饰符，返回值类型 形参变量名 方法体都没有关系
* 在通过对象调用方法时，如何确定某一个指定的方法
*   方法名--->参数列表
*
* */
public class Demo {
    public static void main(String[] args) {
        //overload\
        Demo test = new Demo();
        test.getSum(1,2);
    }



    public void getSum(int a, int b){
        System.out.println(a+b);
    }
}
