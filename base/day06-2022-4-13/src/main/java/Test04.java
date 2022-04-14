import java.util.Random;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/13 9:12
 * 键盘录入班级人数,  根据班级人数录入班级学员姓名
 * 从录入的学员姓名中, 随机取出一个, 并打印在控制台
 */
public class Test04 {
    public static void main(String[] args) {
        //1、提示录入班级人数
        System.out.println("请输入班级人数");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        //根据录入人数生成数组
        String[] arr = new String[num];
        //2、提示录入姓名,存入数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学员的姓名");
            //3、用字符类型接收键盘输入数据
            String classname = number.next();
            arr[i] = classname;
        }
        //3、随机取出姓名
        Random r = new Random();
        int index = r.nextInt(arr.length);
        String name = arr[index];
        System.out.println("本期中奖人员为："+name);

    }
}
