/**
 * @author: zcl
 * @create: 2022/4/12 13:32
 * 现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值
 */
public class ArrayHundred {
    public static void main(String[] args) {
        //1、定义一个整数数组
        int[] arr={2, 1, 3, 5, 4};
        //2、定义一个变量存储数据
        int num =0 ;
        for (int i = 0; i < arr.length; i++) {
            num = num*10+arr[i];
        }
//        num+=arr[4];
        System.out.println(num);
    }
}
