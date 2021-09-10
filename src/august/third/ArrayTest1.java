package august.third;

public class ArrayTest1 {
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
        //方法二
        //
//        for(int i = 0,j = arr.length-1;i<j;i++,j--){
//            String temp =arr[i];
//            arr[i] = arr[j];
//            arr[j] =temp;
//        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


    }
}
