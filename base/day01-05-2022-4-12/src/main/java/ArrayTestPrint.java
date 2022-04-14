/**
 * @author: zcl
 * @create: 2022/4/12 10:55
 */
/*请创建一个长度为5的整数数组，并为数组中的元素赋值，存储元素可以写任意数字。遍历数组，打印所有元素，元素之间用空格隔开
* */

public class ArrayTestPrint {
    public static void main(String[] args) {
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
