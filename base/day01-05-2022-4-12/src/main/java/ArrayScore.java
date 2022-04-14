/**
 * @author: zcl
 * @create: 2022/4/12 13:47
 */
public class ArrayScore {
    public static void main(String[] args) {
        int[] arr= {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
