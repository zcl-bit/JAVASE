/**
 * @author: zcl
 * @create: 2022/4/13 14:38
 */
public class Test10 {
    public static void main(String[] args) {
        int[][] arr = {{20,30,40},{10,35,42},{21,32,49},{51,45,78}};
        int sum = 0;
        int seasonSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                sum=sum + arr[i][i1];
                seasonSum+=arr[i][i1];
            }
            System.out.println("第"+(i+1)+"个季度的营业额为"+seasonSum);
            seasonSum=0;
        }
        System.out.println("总营业额为"+sum);
    }
}
