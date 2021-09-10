package august.thirty;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/30 030 20:12
 * @description： 编译期的异常必须处理
 * @modified By：
 * @version: $
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.regisn(-1001);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s1);


    }
}


class Student{
    private int id;

    public void regisn(int id) throws MyException {
        if(id > 0 ){
            this.id = id;
        }else {
//            System.out.println("输出有误");
 //手动抛出
//            throw new RuntimeException("输出有误");//运行时异常
//                throw new Exception("输入非法");
                throw new MyException("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}