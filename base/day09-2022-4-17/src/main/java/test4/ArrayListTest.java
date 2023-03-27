package test4;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/17 16:53
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student("001","张三","123456");
        Student stu1 = new Student("002","张三","1234");
        Student stu2 = new Student("003","张三","123456");
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        boolean flag = contains(list,"004");
        System.out.println(flag);

    }
    public static boolean contains(ArrayList<Student> stu,String id){
        for (int i = 0; i < stu.size(); i++) {
            Student stu1 = stu.get(i);
            String uid = stu1.getId();
            if (uid.equals(id)) {
                return true;
            }
        }
        return false;
    }
}
