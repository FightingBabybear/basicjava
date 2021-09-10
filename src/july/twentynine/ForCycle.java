package july.twentynine;

public class ForCycle {
    public static void main(String[] args) {

        int[][] arr =new int[][]{{1,2,3},{5,6},{52,512}};


        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
        }

        //https://www.bilibili.com/video/BV1Kb411W75N?p=159&spm_id_from=pageDriver

    }
}
