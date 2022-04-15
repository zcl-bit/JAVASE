package demo5;

/**
 * @author: zcl
 * @create: 2022/4/14 15:18
 */
public class Student {
    //属性
    String name;
    int age;
    //构造 空参和带参数
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    //行为
    public void study(){
        System.out.println("姓名为："+this.name+"的同学正在学习");
    }
}
