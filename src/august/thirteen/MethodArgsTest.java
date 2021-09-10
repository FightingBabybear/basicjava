package august.thirteen;
/*
* 可变个数形参的方法
* 1.jdk5.0新增
*
*
*
* */
public class MethodArgsTest {

    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(2);
        test.show("hell" ,"sdf");
        //test.show("hell" );
        test.show("hell",1,2,3,5);
    }


    public void show(int i){

    }

//    public void show(String s){
//
//    }

    public void show(String ... strs){
        System.out.println("show(String ... strs)");
    }

    public void show(String a,int ... strs){
        System.out.println("show(String ... strs)");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + "\t");
        }
    }

//    public void show(int[] strs){
//        System.out.println("show(String ... strs)");
//    } 和上面方法重复
}
