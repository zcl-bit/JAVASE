import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/12 9:44
 */
public class TestBank {
    public static void main(String[] args) {
        //1、提示用户输入存入金额并用变量存储
        System.out.println("请输入存入金额:(1000起存)");
        Scanner importMoney = new Scanner(System.in);

        int scImportMoney = importMoney.nextInt();
        //2、提示用户输入存入年限并用变量存储
        System.out.println("请输入存入年限:");
        Scanner importYear = new Scanner(System.in);
        int scImportYear = importYear.nextInt();

        //3、定义本息变量
        double moneyYear = 0;

        //4、判断用户输入是否为1000以上
        if (scImportMoney >= 1000) {
            switch (scImportYear) {
                case 1:
                    System.out.println("您选择的年限为:" + scImportYear);
                    moneyYear = scImportMoney + (scImportMoney * scImportYear * 2.25);
                    System.out.println("您的到期本息为：" + moneyYear);
                    break;
                case 2:
                    System.out.println("您选择的年限为:" + scImportYear);
                    moneyYear = scImportMoney + (scImportMoney * scImportYear * 2.7);
                    System.out.println("您的到期本息为：" + moneyYear);
                    break;
                case 3:
                    System.out.println("您选择的年限为:" + scImportYear);
                    moneyYear = scImportMoney + (scImportMoney * scImportYear * 3.25);
                    System.out.println("您的到期本息为：" + moneyYear);
                    break;
                case 5:
                    System.out.println("您选择的年限为:" + scImportYear);
                    moneyYear = scImportMoney + (scImportMoney * scImportYear * 3.6);
                    System.out.println("您的到期本息为：" + moneyYear);
                    break;
                default:
                    System.out.println("您输入的存入年限有误");
                    System.out.println("您的到期本息为：" + moneyYear);
                    break;

            }
        }else{
            System.out.println("您存入的金额为" + scImportMoney + "不足1000元");
        }

    }
}
