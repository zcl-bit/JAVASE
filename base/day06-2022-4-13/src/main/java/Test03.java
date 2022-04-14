/**
 * @author: zcl
 * @create: 2022/4/13 8:47
 * 判断101-200之间有多少个素数
 */
public class Test03 {
    public static void main(String[] args) {
        //由于不知道10-20之间能被5整数的数的个数
        //定义计数器

        int arrayCount = 0;
        for (int i = 101; i <= 200 ; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                arrayCount++;
            }
        }
        int[] arr= new int[arrayCount];
        int index = 0;
        for (int i = 101; i <= 200 ; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                arr[index] = i;
                index ++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
