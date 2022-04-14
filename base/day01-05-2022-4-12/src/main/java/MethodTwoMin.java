import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 14:22
 */
public class MethodTwoMin {
    public static void main(String[] args) {
        System.out.println("请输入数据1");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("请输入数据2");
        Scanner scanner1 = new Scanner(System.in);
        double num2 = scanner.nextDouble();
        System.out.println(getMin(num1,num2));
    }
    public static double getMin(double num1,double num2){
        double min = num1>num2?num2:num1;
        return min;
    }
}
