import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/13 11:19
 * 打印等腰三角形
 *       *
 *      ***
 *     *****
 */
public class Test07 {
    public static void main(String[] args) {
        //1、提示用户输入行数
        System.out.println("请输入要生成的三角形的行数");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i * 2) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
