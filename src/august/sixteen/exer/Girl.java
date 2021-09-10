package august.sixteen.exer;

public class Girl {
    private String name;
    private int age;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Girl(int age) {
        this.age = age;
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

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Girl() {
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);

    }
/*
*
* compare 比较两个对象大小
* */
    public int compare(Girl girl){
//        if(this.age>girl.age){
//            return 1;
//        }else if (this.age< girl.age){
//            return -1;
//        }else {
//            return 0;
//        }
        return this.getAge() - girl.getAge();
    }


}
