import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 10:39
 */
/*键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。*/
public class ForNumberSum {
    public static void main(String[] args) {
        //1、提示用户输入两个数字，并分别用两个变量存储
        System.out.println("请输入数字1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("请输入数字2");
        Scanner scanner1 = new Scanner(System.in);
        int num2 = scanner1.nextInt();

        //2、定义两个变量存储两个数据进行排序
        int maxNumber = num1>num2?num1:num2;
        int minNumber = num1>num2?num1:num2;

        //3、定义一个变量存储和
        int sum = 0;
        //4、循环遍历数据并进行相加
        for (int i =minNumber;i<=maxNumber;i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}
