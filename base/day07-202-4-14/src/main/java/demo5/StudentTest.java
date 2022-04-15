package demo5;

/**
 * @author: zcl
 * @create: 2022/4/14 15:18
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 23;
        s.study();
        //利用带全部参数的构造方法创建对象
        Student s2 = new Student("李四",24);
        s2.study();
    }
}
