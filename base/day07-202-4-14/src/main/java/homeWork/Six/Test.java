package homeWork.Six;

/**
 * @author: zcl
 * @create: 2022/4/14 16:53
 */
public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        Student s1 = new Student("李四", 17);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("李四", 20);
        Student s4 = new Student("李四", 21);
        Student s5 = new Student("李四", 16);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
