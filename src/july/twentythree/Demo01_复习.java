package july.twentythree;

/*
在方法体外，类体内声明的变量称为 成员变量
在方法体内声明的变量称为 局部变量

* 关键字：赋予了特殊含义，用作专门用途的字符串（单词）
* 关键字中所有字母都是小写
*
* 定义变量的格式：
* 数据类型 变量名字 = 变量值；
*
* 变量必须先声明后使用；
*
* 自动类型转换 ：从小到大
*
* String 非常常用
* 避免String s1 = 123;
* 要有 ""
*
* */


public class Demo01_复习 {
    public static void main(String[] args) {

        char c1 = 97;//开发中非常少见
        System.out.println(c1);

        char c3 ='a';
        char c2 = 'a';
        String str = "aa";
        System.out.println(c2+c3);
    }
}
