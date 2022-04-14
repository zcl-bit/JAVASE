/**
 * @author: zcl
 * @create: 2022/4/12 13:49
 * 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
 */
public class ArrayHardTest {
    public static void main(String[] args) {

        int[] arr = {13, 135, 3, 6, 2, 96, 2, 2, 9, 3, 1, 4, 32, 54, 13, 1, 85, 3, 89, 6, 11};
        int[] brr = new int[arr.length];
        int right = arr.length - 1;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                brr[left] = arr[i];
                left++;
            }else{
                brr[right]=arr[i];
                right--;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
    }
}
