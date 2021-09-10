package august.four;
/*
* 选择排序
*   直接选择排序、堆排序
*
* 交换排序
*   冒泡排序、快速排序 *（会手写这两个）
*
* 插入排序
*   直接插入排序、折半插入排序、Shell排序
*
* 归并排序
* 桶式排序
* 基数排序
*
* 算法 介绍：
* 输入：有0或者多个输入
* 输出：至少有一个输出结果
* 有穷性、确定性、可行性
*
*
* */
public class BubbleSortTest {
    public static void main(String[] args) {
//BubbleSortTest

        int[] arr = new int[]{-52,45,45,6,8,1,6,2,9,5,4};

        for(int i =0;i<arr.length -1;i++){
            for(int j = 0;j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }



    }
}
