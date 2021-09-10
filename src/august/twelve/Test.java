package august.twelve;

public class Test {
    public static void main(String[] args) {


    }
}

class Student{
    //属性
    String name;
    int age;
    String major;
    String interests;



    //方法
    public String say(){
        return name + age + major + interests;
    }

}

class Teacher{
    //属性
    String name;
    int age;
    int teachAge;
    String course;



    //方法
    public void say(){
        System.out.println("姓名" + name + age +teachAge + course);
    }

}