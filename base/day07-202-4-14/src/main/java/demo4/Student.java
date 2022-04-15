package demo4;

/**
 * @author: zcl
 * @create: 2022/4/14 15:09
 */
public class Student {
    //属性
    String name;
    int age;
    String gender;
    //构造方法
    public Student(){
        System.out.println("看看我执行了吗？");
    }
    public Student(String name,int age,String gender){
        System.out.println("有参构造被调用了！！！");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //行为
    public void study(){
        System.out.println("姓名为："+name + ",年龄为："+age+",性别为："+gender+"同学正在学习~~~");
    }

    public void shopping(){
        System.out.println("我买了一双鞋，鞋子是："+name);
    }


}
