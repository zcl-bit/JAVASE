package demo6;

/**
 * @author: zcl
 * @create: 2022/4/14 16:00
 */
public class Student {
    String name;
    int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void method(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
