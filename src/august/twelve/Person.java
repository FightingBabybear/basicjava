package august.twelve;

public class Person {
    String name;
    int age;
    int sex;

    /*
    * 1为男性
    * 2为女性
    *
    * */
    public void study(){
        System.out.println("Studing");
    }


    public void showAge(){
        System.out.println(age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
