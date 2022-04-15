package demo3;

/**
 * @author: zcl
 * @create: 2022/4/14 15:05
 */
public class TeacherTest {
    public static void main(String[] args) {
        //新建一个老师类的对象
        Teacher t1 = new Teacher();
        t1.name = "张安";
        t1.age = 30;
        System.out.println(t1.name+ "----"+t1.age);
        t1.teach();
    }
}
