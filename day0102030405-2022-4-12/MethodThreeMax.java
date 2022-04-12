import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 14:27
 */
public class MethodThreeMax {
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
        System.out.println(getMax(num1, num2,num3));
    }

    public static int getMax(int num1, int num2,int num3) {
        int max = num1 > num2 ? num1>num3?num1:num3:num2;
        return max;
    }
}

