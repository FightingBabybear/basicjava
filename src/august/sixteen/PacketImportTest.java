package august.sixteen;

import august.sixteen.exer.Boy;

import java.util.Arrays;
import static java.lang.Math.*;
/*
* 1.多个包
* 2.使用package声明类或者接口所属的包，声明在首行
*
* 包属于标识符 遵循标识符的命名规则、规范
*同一个包下，不能命名同名的接口、类
*
* import声明在包的声明和类的声明之间
* 可以使用xxx.* 导入包下所有结构
*如果使用的类或者接口是lang包下定义的，则可以省略import结构
*本包下定义的，也可以省略import结构
* com.atguigu.exer3.xxx
* com.asdf.sd.xxx a = new xxx(); 全类名
* import static 静态结构
*
*
* */
public class PacketImportTest {
    public static void main(String[] args) {
        String int1 = Arrays.toString(new int[]{1,2,3});

        Boy a = new Boy();



    }
}
