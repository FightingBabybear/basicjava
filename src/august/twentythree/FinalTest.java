package august.twentythree;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/23 023 21:46
 * @description：
 *
 * final 最终的
 * final 修饰 类、方法、变量
 *
 *final 修饰方法 表明此方法不可以被重写
 *
 *
 * @modified By：
 * @version: $
 */
public class FinalTest {
}
//https://www.bilibili.com/video/BV1Kb411W75N?p=343&spm_id_from=pageDriver
final class FinalA{

}

//class FinalB extends FinalA{//Cannot inherit from final 'august.twentythree.FinalA'
//     final类不可继承
//}


class AA{
    public final void show(){

    }


}



class BB extends AA{

//    public void show(){'show()' cannot override 'show()' in 'august.twentythree.AA'; overridden method is final
//    被final修饰的不可以重写
//    }

}
