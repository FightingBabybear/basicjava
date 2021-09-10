package july.twentyeight;

public class ArrayTest2 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};//一维

        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{1,2},{6,7,8}};

        //动态初始化1
        String[][] arr2 = new String[3][2];

        //动态初始化2
        String[][] arr3 = new String[3][];

//动态初始化 默认初始值
        int[][] arr5 =new int[4][3];
        System.out.println(arr5[0]);//[I@6d6f6e28
        System.out.println(arr5[0][0]);

        System.out.println(arr);//[I@135fbaa4


        //https://www.bilibili.com/video/BV1Kb411W75N?p=154&spm_id_from=pageDriver





    }
}
