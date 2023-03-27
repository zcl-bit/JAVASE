package test2;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/17 16:44
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",25);
        Student stu2 = new Student("张三",28);
        list.add(stu1);
        list.add(stu2);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+"," + stu.getAge());
        }
    }
}
