package july.twentythree;

public class Demo_随意给一个整数_打印显示它的个位十位百位 {
    public static void main(String[] args) {

        int a= 522;

        int bai = a/100;
        int shi = (522-(bai*100))/10;
        int ge = a - bai*100 - shi *10;
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);

    }
}
