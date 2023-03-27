package homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/18 8:11
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            String number = sc.next();
            switch (number) {
                case "1":
                    add(list);
                    break;
                case "2":
                    remove(list);
                    break;
                case "3":
                    update(list);
                    break;
                case "4":
                    select(list);
                    break;
                case "5":
                    System.out.println("退出系统");
                    System.exit(0);
                default:
                    System.out.println("无该序号");
                    break;
            }
        }
    }

    /*
    添加学生
    **/
    public static void add(ArrayList<Student> list) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生学号");
            String id = sc.next();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            String age = sc.next();
            System.out.println("请输入学生居住地");
            String address = sc.next();
            Student stu = new Student(id, name, age, address);
            int index = getIndex(list,id);
            if(index == -1){
                System.out.println("您输入的学号已经被占用，请重新输入");
            }else{
                list.add(stu);
                System.out.println("添加学生成功");
                break;
            }
        }
    }

    /*
    删除学生
    * */
    public static void remove(ArrayList<Student> list) {
        while(true){
            System.out.println("请输入你要删除的学生的学号");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getIndex(list,id);
            if (index != -1){
                list.remove(index);
                System.out.println("删除成功");
            }else{
                System.out.println("该信息不存在，请重新输入");
            }
        }

    }

    /*
    修改学生
    * **/
    public static void update(ArrayList<Student> list){
        while(true) {
            System.out.println("请输入你要修改的学生的学号");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            int index = getIndex(list, id);
            if (index != -1) {
                Student stu = list.get(index);
                System.out.println("请输入学生新姓名");
                String name = sc.next();
                System.out.println("请输入学生新年龄");
                String age = sc.next();
                System.out.println("请输入学生新居住地");
                String address = sc.next();
                stu.setName(name);
                stu.setAge(age);
                stu.setAddress(address);
                System.out.println("修改成功");
                break;
            } else {
                System.out.println("当前输入的id不存在，请重新输入");
            }
        }
    }

    /*
     * 查看学生
     * */
    public static void select(ArrayList<Student> list) {
        if (list.size()==0){
            System.out.println("无信息，请先添加信息在查询");
        }else{
            System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "居住地");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getSid() + "\t"+"\t" + stu.getName() + "\t"+"\t" + stu.getAge() + "岁\t"
                        + stu.getAddress());
            }
        }

    }
    /*
    查找学生学号是否存在
    * **/
    public static int getIndex(ArrayList<Student> list,String id){
        if(list.size() == 0){
            return 1;
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu1 = list.get(i);
            String sid = stu1.getSid();
            if (sid .equals(id)){
                return i;
            }
        }
        return -1;
    }
}
