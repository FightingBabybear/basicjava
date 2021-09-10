package august.thirty;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/30 030 20:22
 * @description：
 * 自定义异常类
 * 1.继承于现有的异常结构 RuntimeException Exception
 *2.提供全局常量
 * 3.提供构造器
 *
 *
 *
 *
 * @modified By：
 * @version: $
 */
public class MyException extends RuntimeException{//Exception
    //serialVersionUID序列号 与类共存
    static final long serialVersionUID = -703489719266939L;

    public MyException(){

    }

    public MyException(String message) {
        super(message);
    }


}
