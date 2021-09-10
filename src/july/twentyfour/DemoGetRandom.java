package july.twentyfour;
/*
* 获取10-99的随机数
* Math.random()  【0，1）
* */
public class DemoGetRandom {
    public static void main(String[] args) {

        int a = (int)(Math.random()*90 + 10);// 左闭右开
        System.out.println(a);

    }
}
