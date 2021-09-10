package july.twentyseven;
/*
*
* break 结束循环
*continue 结束当前循环
*
* */
public class BreakContinue {
    public static void main(String[] args) {


        //**************************

        label1:for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                if(i1%4 == 0){
                    //break;//默认跳出包裹此关键字最近的一层
                    //continue

                    break label1;//结束指定标识的一层循环
                    //continue label1; 外层的下一次循环
                }
            }
        }


    }
}
