import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 10:20
 */
public class SwitchSeason {
    public static void main(String[] args) {
        /*一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出。 */
        //1、提示用户输入月份
        System.out.println("请输入月份");
        Scanner importMonth = new Scanner(System.in);
        int month = importMonth.nextInt();

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println(month + "月份为春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(month + "月份为夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(month + "月份为秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(month + "月份为冬季");
                break;
            default:
                System.out.println("输入月份错误");
                break;

        }
    }
}
