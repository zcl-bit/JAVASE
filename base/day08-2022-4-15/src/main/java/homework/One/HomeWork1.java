package homework.One;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:48
 * 现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。
 */
public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("请输入工人姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入工人工龄");
        int year = sc.nextInt();
        Worker w1 = new Worker(name,year);
        System.out.println("姓名"+w1.getName()+"工龄"+w1.getYear());


    }
}
