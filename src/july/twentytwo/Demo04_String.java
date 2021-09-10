package july.twentytwo;
/*
* 1.String 引用数据类型  翻译为：字符串
* 2.声明 使用一对""
* 3.只能是连接运算 +
* 4.运算的结果仍然是String类型
*
* */
public class Demo04_String {
    public static void main(String[] args) {
        String s1 ="Hello World";
        System.out.println(s1);
        String s2 = "a";
        System.out.println(s2);
        String s3 = "\\";
        System.out.println(s3);
        String s4 = "你好";
        System.out.println(s4);

        //字符串拼接 +
        int num = 100;
        String oneName = "小明";
        System.out.println(oneName+num);
        String str = oneName + num;
        System.out.println(str);
        boolean b1 =true;
        System.out.println(oneName+b1);
    }
}
