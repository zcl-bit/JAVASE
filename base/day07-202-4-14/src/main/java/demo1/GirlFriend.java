package demo1;

/**
 * @author: zcl
 * @create: 2022/4/14 14:26
 * 用来描述一类事物的类
 * 里面不写main方法，叫做Javabean类，实体类
 */
public class GirlFriend {
    //女朋友有什么属性？名词
    //姓名，性别，年龄，身高
    String name;
    char gender;
    int age;
    double height;

    //女朋友有什么行为？动词，这类事务能干什么？
    //吃饭，睡觉，买东西。。。
    public void eat(){
        System.out.println("女朋友在吃饭");
    }
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void shopping(){
        System.out.println("女朋友在购物");
    }
}
