package august.third;
/*实现array2和array1数组的复制*/
public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }

        //数组的复制
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"\t");
        }


    }
}
