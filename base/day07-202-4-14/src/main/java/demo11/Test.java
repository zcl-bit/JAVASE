package demo11;

/**
 * @author: zcl
 * @create: 2022/4/14 16:19
 */
public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student s1 = new Student("zhangsan",23,"传智大学");
        Student s2 = new Student("lisi",24,"传智大学");
        Student s3 = new Student("wangwu",25,"家里蹲大学");

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            System.out.println(s.getName()+","+s.getAge()+","+s.getSchool());
        }
    }
}
