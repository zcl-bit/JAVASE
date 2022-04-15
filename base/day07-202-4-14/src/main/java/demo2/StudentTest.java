package demo2;

/**
 * @author: zcl
 * @create: 2022/4/14 14:56
 */
public class StudentTest {
    public static void main(String[] args) {
        //1、创建第一个学生对象并赋值调用
        Student stu1 = new Student();
        System.out.println(stu1.name+"----"+stu1.age);
        stu1.name="李雷";
        stu1.age = 15;
        System.out.println(stu1.name+"----"+stu1.age);
        stu1.playGame();

        //2、创建第二个学生对象并赋值调用
        Student stu2 = new Student();
        stu2.name = "朱成成";
        stu2.age = 16;
        System.out.println(stu2.name+"----"+stu2.age);
        stu2.playGame();
    }


}
