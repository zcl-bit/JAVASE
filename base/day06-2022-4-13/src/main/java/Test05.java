import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/13 9:42
 * 在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
 */
public class Test05 {
    public static void main(String[] args) {
        //1、定义一个整数类型长度为6的数组
        int[] arr = new int[6];
        //2、遍历数组提示评委进行打分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委进行打分");
            Scanner sc = new Scanner(System.in);
            //3、定义变量存储分数
            int score = sc.nextInt();
            //4、将分数存入数组中
            arr[i]=score;
        }
        //3、定义最小值和最大值变量,总和变量
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min]>arr[i]){
                min = i;
            }
            if(arr[max]<arr[i]){
                max = i;
            }
            sum+=arr[i];
        }
        //4、选手得分
        int endScore = (sum-arr[min]-arr[max])/(arr.length-2);
        System.out.println("选手最终得分为：" + endScore);
    }
}
