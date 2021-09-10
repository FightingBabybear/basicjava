package august.twentyseven;

import org.junit.Test;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/27 027 21:59
 * @description：
 * 异常的处理
 * 抓抛模型
 *
 * 1.抛  一旦出现异常，在异常处 生成对应异常类的对象
 *          一旦抛出对象，其后的代码不再执行
 *
 *
 * 2.抓
 *      try-catch-finally
 *      throws
 *
 * try-catch-finally的使用
 * try{
 *     //可能出现异常的代码
 * }catch(异常类型1 变量名1){
 *     //处理异常的方式1
 * }catch(异常类型2 变量名2){//一旦处理完成 ，跳出当前的try-catch结构
 *       //处理异常的方式1
 * }catch(异常类型3 变量名3){
 *      //处理异常的方式1      子类一定要声明在父类上面，否则报错
 * }
 *
 * finally{
 *     //一定会执行的代码
 * }
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class ExceptionTest1 {

    @Test
    public void test1(){

        String str = "123";
        str = "abc";
        try{
            int num = Integer.parseInt(str);//NumberFormatException
        }catch (NumberFormatException e){
//            System.out.println("出现数值转换异常");
            System.out.println(e.getStackTrace());
        }

       // https://www.bilibili.com/video/BV1Kb411W75N?p=376&spm_id_from=pageDriver



    }



}
