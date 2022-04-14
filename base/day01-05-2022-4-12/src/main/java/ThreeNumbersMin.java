import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 9:26
 */
public class ThreeNumbersMin {
    public static void main(String[] args) {
        /*让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
        //1、提示用户输入三个整数
        System.out.println("请输入第一个整数");
        Scanner sc1 = new Scanner(System.in);
        int num1=  sc1.nextInt();
        System.out.println("请输入第二个整数");
        Scanner sc2 = new Scanner(System.in);
        int num2=  sc2.nextInt();
        System.out.println("请输入第三个整数");
        Scanner sc3 = new Scanner(System.in);
        int num3=  sc3.nextInt();

        int minNumber = num1>num2?num2>num3?num3:num2:num1;
        System.out.println("三个数中最小的数为："+minNumber);
    }
}
