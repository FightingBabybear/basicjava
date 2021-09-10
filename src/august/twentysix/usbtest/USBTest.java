package august.twentysix.usbtest;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/26 026 17:01
 * @description：
 * @modified By：
 * @version: $
 */
public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象

        USB flash = new Flash();
        com.transferData(flash);

        //接口的非匿名实现类的匿名对象
        com.transferData(new Flash());

        //创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };


        // 创建匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
}

class  Computer{

    public void transferData(USB usb){
        usb.start();
        System.out.println("传输数据");
        usb.stop();
    }

}

interface USB{
    void start();

    void stop();

}


class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}