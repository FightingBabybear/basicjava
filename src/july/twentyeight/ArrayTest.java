package july.twentyeight;
/*
*
* 数组名
* 元素
*数组的长度：元素的个数
*
* 数组是有序排列
*
* 数组是 引用数据类型 的变量
* 数组的元素 可以是基本数据类型也可以是引用数据类型
*
* 数组在内存中开辟连续的空间；数组 长度一旦确认，不可修改
*
* 数组分类：
* 1.按照维度，一维数组，二维数组
* 2.按照数组元素：基本数据类型元素的数组，引用数据类型元素的数组..
*
*  一维数组的使用;
*       1.一维数组的声明和初始化
*       2.调用数组的指定位置的元素
*       3.获取数组的长度
*       4.遍历数组
*       5.数组元素的默认初始化值
*       6.数组的内存解析
*
* */


public class ArrayTest {
    public static void main(String[] args) {

        int num;//shengming
        num = 10;//chushihua

        // int[] ids;声明
        int[] ids = new int[]{100,1001,200,300};//静态初始化

        //动态初始化   数组初始化和数组元素的赋值分开进行
        String[] names = new String[5];

        System.out.println(ids[1]);
        System.out.println(names.length);//获取数组长度
//数组一旦初始化完成，长度就确定了

        //调用数组指定位置的元素：通过角标的方法调用
        //FUZHI
        names[0] = "wangming";
        names[4] = "nihao";
        names[4] = "niao";
        String name = names[4];
        System.out.println(name);




    }
}
