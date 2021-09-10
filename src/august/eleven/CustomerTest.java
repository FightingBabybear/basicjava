package august.eleven;
/*
* 方法：描述类应该具有的功能
* 比如：Math类 sqrt()。
*  Scanner类
*  Array类
*   binarySearch()
*
* 1.举例
* 方法的声明：权限修饰符  返回值类型 方法名（形参）｛
*      方法体
* ｝
*   static final abstract修饰的方法 后面再讲
*
* 返回值类型
* 1.有返回值
* 如果方法有返回值，则必须在方法声明时，指定返回值的类型
* 同时方法中需要使用return返回指定类型
* 2.没返回值
*  void
*
* 方法名：属于标识符，遵循标识符的规则和规范，见名起意
* 形参表列 ：数据类型 形参1
*
* 方法的使用中，可以调用当前类的属性和方法
* */
public class CustomerTest {
    public static void main(String[] args) {

        //https://www.bilibili.com/video/BV1Kb411W75N?p=191&spm_id_from=pageDriver

    }
}


class Customer{
    //
    String name;
    int age;
    boolean isMale;

    //方法


    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public int getAge(){
        return age;

    }

    public String getNation(String nation){
        String info = "我的国籍" + nation;
        return info;
    }





}