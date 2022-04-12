import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 10:44
 */
/*
键盘录入两个数字，表示一个范围。

​           统计这个范围中。

​	    既能被3整除，又能被5整除数字有多少个？
 */
public class ForNumberCount {
    public static void main(String[] args) {
        //1、提示用户输入两个数字，并分别用两个变量存储
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字1");
        int num1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入数字2");
        int num2 = scanner1.nextInt();

        //2、定义两个变量存储两个数据进行排序
        int maxNumber = num1>num2?num1:num2;
        int minNumber = num1>num2?num1:num2;
        //3、定义一个变量存储个数
        int count = 0;
        //4、循环遍历数据并进行相加
        for (int i =minNumber;i<=maxNumber;i++){
            if(i%3==0 && i%5==0){
                count++;
            }
        }
        System.out.println("在数字"+num1+"到数字"+num2+"中可以被3和5整除的数字有"+count+"个");

    }
}
