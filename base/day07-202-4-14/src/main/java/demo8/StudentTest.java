package demo8;

/**
 * @author: zcl
 * @create: 2022/4/14 16:06
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(18);
        System.out.println(s1.getName()+"---"+s1.getAge());

        Student s2 = new Student("lisi",18);
        System.out.println(s2.getName()+"---"+s2.getAge());
    }
}
