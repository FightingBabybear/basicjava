package august.two;

public class DemoExam {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10);//【10，99】
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }


        //求数组元素的最大值
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        System.out.println("最大值为"+MaxValue);

        //求数组元素的最小值
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(MinValue > arr[i]){
                MinValue = arr[i];
            }
        }



        //求数组元素的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为" + sum);

        //求数组元素的平均数




        double avg = (double) sum/arr.length;

        https://www.bilibili.com/video/BV1Kb411W75N?p=162&spm_id_from=pageDriver
        System.out.println(avg);

    }
}
