package july.twentytwo;
/*
* https://www.bilibili.com/video/BV1Kb411W75N?p=69&spm_id_from=pageDriver
*
* */

public class Demo05_String运算题 {
    public static void main(String[] args) {
        char c = 'a';
        int num = 10;
        String str = "Hello";
        System.out.println(c+num+str);//107Hello
        System.out.println(c + str +num);//aHello10
        System.out.println(c + (num + str));//a10Hello
        System.out.println((c+num)+str);//107Hello
        System.out.println((str + num +c));//Hello10a
        //------------------------------------

        System.out.println("*  *");
        System.out.println('*'+'\t'+'*');//不行
        System.out.println('*'+"\t"+'*');//双引号是String
    }
}
