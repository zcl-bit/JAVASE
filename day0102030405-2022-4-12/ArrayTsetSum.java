/**
 * @author: zcl
 * @create: 2022/4/12 15:08
 */
public class ArrayTsetSum {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0 && arr[i]/10%10!=7 && arr[i]%10!=7){

                System.out.print(arr[i]+" ");
                sum+=arr[i];
            }

        }
        System.out.println();
        System.out.println(sum);

    }

}
