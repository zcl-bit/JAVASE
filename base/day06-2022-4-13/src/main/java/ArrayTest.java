/**
 * @author: zcl
 * @create: 2022/4/13 7:26
 * 将10 – 20 之间能被5整除的数存入到数组当中，并遍历这个数组。
 */
public class ArrayTest {
    public static void main(String[] args) {
        //由于不知道10-20之间能被5整数的数的个数
        //定义计数器
        int count = 0;
        for (int i = 10; i <= 20 ; i++) {
            if (i % 5 == 0){
                count++;
            }
        }
        int[] arr= new int[count];
        int j = 0;
        for (int i = 10; i <= 20 ; i++) {

            if (i % 5 == 0){
                arr[j]=i;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
