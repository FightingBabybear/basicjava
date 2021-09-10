package august.third;
/*
* 线性查找
* 二分法查找
*
*
* */

public class ArraySearch {
    public static void main(String[] args) {
        String[] arr = new String[]{"gg","sss","mm"};
        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        //方法一
        for(int i = 0;i< arr1.length/2;i++){

            String temp = arr1[i];
            arr1[i] =arr1[arr.length-i-1];
            arr1[arr.length-i-1] = temp;

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //查找（搜索）
        String best = "gg";
        boolean isflag = true;

        for (int i = 0; i < arr.length; i++) {
            if(best.equals(arr[i])){
                System.out.println("找到了指定的元素，位置为"+i);
                isflag = false;
                break;
            }
        }
        if (isflag){
            System.out.println("很遗憾没有找到");
        }


        //二分法查找：折半查找（前提：有顺序的）
        int[] arrint = new int[]{1,2,3,4,5,6,7,9};

        int d = 3;
        int head =0;//初始的首索引
        int end = arrint.length-1;
        boolean isF = true;
        while (head <= end ){

            int middle = (head + end)/2;
            if(d == arrint[middle]){
                System.out.println("找到了，位置为"+middle);
                isF =false;
                break;
            }else if(arrint[middle] > d){
                end = middle -1;

            }else {
                head = middle+1;
            }
        }
        if(isF){
            System.out.println("抱歉没找到");
        }

    }
}
