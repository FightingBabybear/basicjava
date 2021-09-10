package august.third;
/*
* 创建一个名为ArrayTest2的类，在main()方法中声明array1和array2两个变量
*
* 他们是int[]类型的数组
*
* 使用大括号｛｝,把array1初始化为8个素数
* 显示array1的内容
*
* 赋值array2变量等于array1 修改array2中的偶索引元素，
* 使其等于索引值 （array[0] = 0 array[2] =2） 打印array1
*
* 修改题目 实现array2和array1数组的复制
* */
public class ArrayTest2 {
    public static void main(String[] args) {

        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
        //同一个地址 不能称作数组的复制
        array2 = array1;

        for (int i = 0; i < array2.length; i++) {
            if(i%2==0){
                array2[i] = i;
            }

        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }

    }
}
