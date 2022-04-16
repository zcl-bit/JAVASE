package stringtest;

/**
 * @author: zcl
 * @create: 2022/4/16 14:19
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }

    private static String arrToString(int[] arr) {
        if (arr == null){
            return null;
        }
        if (arr.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                result = result + arr[i];
            }else{
                result = result + arr[i] + ",";
            }

        }
        result = result + "]";
        return result;
    }
}
