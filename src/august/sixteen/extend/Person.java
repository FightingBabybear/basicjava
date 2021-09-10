package august.sixteen.extend;

/**
 * @author ：Eas
 * @date ：Created in 2021/8/16 016 22:33
 * @description：
 * @modified By：
 * @version: $
 */
public class Person {
    private String name;
    private int age;

    //https://www.bilibili.com/video/BV1Kb411W75N?p=260&spm_id_from=pageDriver
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
