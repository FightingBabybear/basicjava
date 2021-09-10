package august.eighteen.useageexer;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/18 018 22:23
 * @description：
 * @modified By：
 * @version: $
 */
public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.func(new Dog());


    }
public void func(Animal animal){//Animal animal = new Dog();
    animal.eat();
    animal.shout();
    animal.slepp();
}



}

//https://www.bilibili.com/video/BV1Kb411W75N?p=284&spm_id_from=pageDriver
class Animal{

    public void eat(){
        System.out.println("动物进食");
    }

    public void shout(){
        System.out.println("动物叫");
    }
    public void slepp(){
        System.out.println("睡觉");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃鱼");
    }

    public void shout(){
        System.out.println("狗叫");
    }

//    public void slepp(){
//        System.out.println("狗睡觉");
//    }
}


class Cat extends Animal{
    public void eat(){
        System.out.println("mao吃鱼");
    }

    public void shout(){
        System.out.println("mao叫");
    }
}