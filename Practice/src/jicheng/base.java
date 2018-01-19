package jicheng;

public class base {
    private String name;
    private int age;
    private String number;
    base(){};
    base(String name,int age,String number){
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "name:"+name+"age:"+age;
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
