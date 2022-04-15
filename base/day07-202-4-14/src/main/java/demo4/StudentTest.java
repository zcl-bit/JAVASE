package demo4;

/**
 * @author: zcl
 * @create: 2022/4/14 15:09
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18,"男");
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.gender);
        stu1.study();
    }
}
