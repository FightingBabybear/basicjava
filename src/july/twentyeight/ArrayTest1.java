package july.twentyeight;

public class ArrayTest1 {
    public static void main(String[] args) {

        //数组元素的默认初始化值
        // int 为0
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //引用数据类型 为 null
        String[] arr1 = new String[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        if(arr1[0]==null){
            System.out.println("苏州");
        }

        //浮点型为 0.0
        double[] arr2 = new double[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //char 阿斯科马 输出的0 对应
        char[] arr3 = new char[4];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        if(arr3[0] == 0){
            System.out.println("你好");
        }


        //boolean 默认为false
        boolean[] arr4 = new boolean[4];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }


        String tel = "";
        tel += 1;
        System.out.println(tel);

    }

}
