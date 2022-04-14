import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 14:58
 */
public class MethodRound {
    public static void main(String[] args) {
        //1、提示用户输入数据
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        double num =sc.nextDouble();
        System.out.println(getRound(num));
    }
    public static int getRound(double num){
        int a = 0;
        a= (int) ((num*10)%10);
        if (a >= 5) {
            num=(int)(num+1);
        }else{
            num=(int)(num);
        }
        return (int) num;
    }
}
