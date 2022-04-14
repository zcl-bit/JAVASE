import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: zcl
 * @create: 2022/4/13 15:48
 * 双色球系统
 * 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码
 */
public class Test11 {
    public static void main(String[] args) {
        //随机生成一组彩票号码
        //红球：1-33 6个
        //蓝球：1-16 1个
        int[] luckNumbers = createLuckNumber();
        //键盘录入自己的彩票号码
        int[] userNumbers = userInputNumber();
        //比较中了多少个红球和蓝球
        judge(luckNumbers, userNumbers);
    }

    //随机生成彩票号码,1-33不重复
    public static int[] createLuckNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            } else {
                System.out.println("重新生成一个号码");
            }
        }
        //当循环结束之后，表示所有的红球都已经生成并存入数组
        //接下来，生成蓝球号码并存入数组
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        //把数组返回
        return arr;
    }

    //判断数据是否在数组中已经存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                //只要有一个一样，那么表示number在arr中是存在的，返回true
                return true;
            }
        }
        //当循环结束之后，表示数组里面所有的元素已经判断完毕，就是不存在，返回false
        return false;
    }

    //用户输入的彩票号码
    public static int[] userInputNumber() {
        //定义一个数组，存红球号码和蓝球号码
        int[] arr = new int[7];
        //用户键盘输入彩票号码红球1-33；
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码1-33");
            int redNumber = sc.nextInt();
            boolean flag = contains(arr, redNumber);
            //判断用户输入的数据范围是否在1-33的范围，并且在数组arr中是不存在的
            if (redNumber >= 1 && redNumber <= 33 && !flag) {
                arr[i] = redNumber;
                //只有成功存入，i才会加1
                i++;
            } else {
                System.out.println("您的红球号码输入有误，请重新输入");
            }
        }
        //当循环结束之后，表示所有的红球号码已经录入完毕
        //接下来录入篮球号码即可
        while (true) {
            System.out.println("请输入蓝球号码1-16");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                //数据存入之后，循环结束
                break;
            } else {
                System.out.println("您输入的蓝球号码有误，请重新输入");
            }
        }
        return arr;
    }

    //进行比较
    public static void judge(int[] luckNumbers, int[] userNumbers) {
        //定义计数器
        int redCount = 0;
        int blueCount = 0;
        //遍历用户的数组，获取每一个用户的号码（只要比红球）
        for (int i = 0; i < userNumbers.length-1; i++) {
            //i 表示索引 userArr[i] 用户彩票号码
            //拿着用户的号码到awordNumber数组中去判断，是否存在
            boolean flag1 = contains(luckNumbers,userNumbers[i]);
            //如果为真
            if(!flag1){
                redCount++;
            }
        }
        boolean flag2 = userNumbers[userNumbers.length-1] == luckNumbers[luckNumbers.length-1];
        if (flag2){
            blueCount++;
        }
        System.out.println("红球中了"+redCount+"个");
        System.out.println("蓝球中了"+blueCount+"个");

        if((redCount == 2 && blueCount ==1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中了六等奖，奖金5元");
        }else if((redCount == 4 && blueCount ==0) || (redCount ==3 && blueCount == 1)){
            System.out.println("恭喜你，中了五等奖，奖金10元");
        }else if((redCount == 5 && blueCount ==0) || (redCount ==4 && blueCount == 1)){
            System.out.println("恭喜你，中了四等奖，奖金200元");
        }else if(redCount == 5 && blueCount ==1){
            System.out.println("恭喜你，中了三等奖，奖金3000元");
        }else if(redCount == 6 && blueCount ==0){
            System.out.println("恭喜你，中了二等奖，奖金500万元");
        }else if(redCount == 6 && blueCount ==1){
            System.out.println("恭喜你，中了一等奖，奖金1000万元");
        }else{
            System.out.println("脸黑，没中~");
        }

    }


}
