package august.fourteen;
/*
* 面向对象的特性 封装
*
*
* 封装性的体现，需要权限修饰符来配合
* private 缺省 protected public
*修饰类和类的内部结构 属性 方法 构造器 内部类
*
* 修饰类 只能 public 和缺省
*
* */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        //a.age = 12;
        //a.legs = 4;//'legs' has private access in 'August.fourteen.Animal'


        a.show();
        a.setLegs(6);
        System.out.println(a.getLegs());
        a.setAge(50);
        System.out.println(a.getAge());
    }
}

class Animal{
    String name;
    private int age;
    private int legs;

    public void setLegs(int l ){
        if (l>=0 &&l%2 == 0){
            legs= l;
        }else {
            legs = 0;
        }
    }

    public int getLegs(){
        return legs;
    }



    public void eat(){
        System.out.println("动物进食");
    }

    public void show(){

        System.out.println("name "+name + "legs" + legs);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}