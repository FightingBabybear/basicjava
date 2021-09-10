package september.nine;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/9 009 17:04
 * @description：
 * @modified By：
 * @version: $
 */
public class DateTimeTest {
    /*
    * SimpleDateFormat
    * 1.格式化 日期--->字符串
    * 解析 格式化的逆过程  字符串-->日期
    *
    *
    * */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        //格式化
        Date date = new Date();
        System.out.println(date);//Thu Sep 09 17:37:06 CST 2021
        String format = simpleDateFormat.format(date);
        System.out.println(format);//21-9-9 下午5:37

        //解析  字符串-->日期
        String str = "21-9-9 下午6:37";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);//Unparseable date: "2019-08-07"


        //*************按照指定的方式格式化和解析：调用带参的构造器*****************
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021-09-09 07:06:54
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        //否则，抛异常
        Date date2 = sdf1.parse("2020-02-18 11:48:27");
        System.out.println(date2);//Tue Feb 18 11:48:27 CST 2020




        //https://www.bilibili.com/video/BV1Kb411W75N?p=491&spm_id_from=pageDriver

    }
    /*
     * 练习一 字符串： "2021-09-09"转换为java.sql.Date
     *
     * */
    @Test
    public void  test3() throws ParseException {
        String da = "2021-09-09";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date format2 = sdf2.parse(da);
        java.sql.Date date = new java.sql.Date(format2.getTime());
        System.out.println(date);
    }

    @Test
    public void testCalendar() {
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//class java.util.GregorianCalendar














    }






    /*
    java.util.Date类
           |---java.sql.Date类

    1.两个构造器的使用
        >构造器一：Date()：创建一个对应当前时间的Date对象
        >构造器二：创建指定毫秒数的Date对象
    2.两个方法的使用
        >toString():显示当前的年、月、日、时、分、秒
        >getTime():获取当前Date对象对应的毫秒数。（时间戳）

    3. java.sql.Date对应着数据库中的日期类型的变量
        >如何实例化
        >如何将java.util.Date对象转换为java.sql.Date对象
     */
    /*
    TODO suanfa
    https://www.bilibili.com/video/BV1Kb411W75N?p=475&spm_id_from=pageDriver
    */
    @Test
    public void test2(){
        //构造器一：Date()：创建一个对应当前时间的Date对象 当前时间的对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Thu Sep 09 17:10:19 CST 2021

        System.out.println(date1.getTime());//1631178619347

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1631178619347L);
        System.out.println(date2.toString());//Thu Sep 09 17:10:19 CST 2021

        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(35235325345L);
        System.out.println(date3);//1971-02-13

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
//        Date date4 = new java.sql.Date(2343243242323L);
//        java.sql.Date date5 = (java.sql.Date) date4;
        //情况二：
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());


    }









    @Test
    public void test1(){
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
        //称为时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
