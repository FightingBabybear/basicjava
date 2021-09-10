package july.thirty;
/*
* yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
* */

public class yanghui {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] yangHui = new int[10][];
        //给数组的元素赋值

       // yangHui[0] = new int[2];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1];
            //2.1 赋值 给首末元素赋值
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
            //每行的分首末元素赋值
            if(i>1){
                for(int j = 1;j<yangHui[i].length - 1;j++){
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }

            }
        }



        //遍历
        for (int i = 0; i < yangHui.length; i++) {
            for (int i1 = 0; i1 < yangHui[i].length; i1++) {
                System.out.print(yangHui[i][i1] + " ");

            }
            System.out.println();
        }

    }


}
