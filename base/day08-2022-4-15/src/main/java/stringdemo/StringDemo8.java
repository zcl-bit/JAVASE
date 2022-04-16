package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 8:05
 */
public class StringDemo8 {
    public static void main(String[] args) {
        //切割字符串
        String s = "ajl,jfg,o,p,j,j,g";
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
