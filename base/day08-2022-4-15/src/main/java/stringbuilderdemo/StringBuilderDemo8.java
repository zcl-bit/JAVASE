package stringbuilderdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 14:16
 */
public class StringBuilderDemo8 {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
