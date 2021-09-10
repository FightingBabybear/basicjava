package july.twentythree;

public class Demo_逻辑运算符判断 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;

        if((z++==42)&&(y=true))z++; //z 44
        if((x=false)||(++z==45))z++; // 44+1 = 45 ==45 true  此时z == 45  然后z++ z==45+1==46
        System.out.println(z); //结果46
    }
}
