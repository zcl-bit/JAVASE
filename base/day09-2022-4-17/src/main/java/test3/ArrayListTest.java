package test3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/17 16:48
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个学生的姓名");
            String name = sc.next();
            System.out.println("请输入第"+i+"个学生的年龄");
            int age = sc.nextInt();
            Student stu = new Student(name,age);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+"\t"+stu.getAge());
        }
    }
}
