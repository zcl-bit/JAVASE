import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 14:51
 * 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回
 */
public class MethodAbs {
    public static void main(String[] args) {
        //1、提示用户输入数据
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        double num =sc.nextDouble();
        System.out.println(getAbs(num));
    }
    public static double getAbs(double num){
        double abs=0;
        if (num >= 0) {
            abs = num;
        }else{
            abs = -num;
        }

        return abs;
    }
}
