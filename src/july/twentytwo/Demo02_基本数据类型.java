package july.twentytwo;
/*
*
*
* */
public class Demo02_基本数据类型 {
    public static void main(String[] args) {
        // byte 1字节  -128~127
        // short 2字节
        // int 4字节 约21亿
        //  long 8字节
        byte b1 = 12;
        byte b2 = -128;
//        b2 = 128;
        System.out.println(b1);
        System.out.println(b2);
        long l1 = 23156423131L;
        System.out.println(l1);


        /*
        * 浮点型
        * float 4字节 单精度
        * double 8字节 双精度
        *float要以f或者F结尾
        * */
        float f1 = 3.14f;
        System.out.println(f1);
        double d1 = 3.1;
        System.out.println(d1+1);
        /*
        * 字符类型 char (1字符=2字节)
        *
        * */
        //通常使用单引号 内部只能写一个字符
        char c1 = 'a';
        System.out.println(c1); //结果 a
        char c2 = '中';
        System.out.println(c2);

        //1.声明一个字符 2.转义字符
        char c5 = '\n';//换行符
        c5 = '\t';
        System.out.println("Hello"+c5);
        System.out.println("World");

        //使用unicode值表示字符常量
        char c6 = '\u0043';//Unicode编码集
        System.out.println(c6);
        //布尔值 boolean
        //判断、循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);

        boolean isMarried = true;
        if(isMarried){
            System.out.println("不能参加\"单身\"派对！\\n很遗憾");
        }else {
            System.out.println("加油哦");
        }


    }
}
