import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 14:30
 * 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量
 */
public class MethodThreeNumber {
    public static void main(String[] args) {
        System.out.println("请输入数据1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("请输入数据2");
        Scanner scanner1 = new Scanner(System.in);
        int num2 = scanner.nextInt();
        System.out.println("请输入数据3");
        Scanner scanner2 = new Scanner(System.in);
        int num3 = scanner.nextInt();
        getMax(num1, num2,num3);
    }

    public static void getMax(int num1, int num2, int num3) {
        int max = 0;
        int middle = 0;
        int min = 0;
        int sum = num1+num2+num3;
        max = num1 > num2 ? num1>num3?num1:num3:num2;
        min = num1 < num2 ? num1<num3?num1:num3:num2;
        middle = sum-max-min;
        System.out.print(max+" ");
        System.out.print(middle+" ");
        System.out.print(min);
    }
}
