import java.util.Random;

/**
 * @author: zcl
 * @create: 2022/4/13 14:21
 * 一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复
 */
public class Test09 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        //打乱数组顺序
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元的奖金已经被抽出");
        }
    }
}
