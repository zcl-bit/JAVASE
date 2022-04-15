package demo1;

/**
 * @author: zcl
 * @create: 2022/4/14 14:27
 */
public class Test1 {
    public static void main(String[] args) {
        //在书写面向对象代码的时候
        //1、我们要定义一个类去描述这类事物
        //2、创建一个对象，此时就表示你在代码世界中就有了一个女朋友


        //需要在测试类中创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();

        System.out.println(gf1.name+"---"+gf1.gender+"---"+gf1.age+"---"+gf1.height);

        //给我的第一个女朋友赋值
        gf1.name = "小试试";
        gf1.gender='女';
        gf1.age = 18;
        gf1.height = 1.68;
        System.out.println(gf1.name+"---"+gf1.gender+"---"+gf1.age+"---"+gf1.height);
        //调用女朋友的行为，让他开始吃饭，睡觉，购物
        gf1.eat();
        gf1.sleep();
        gf1.shopping();

    }
}
