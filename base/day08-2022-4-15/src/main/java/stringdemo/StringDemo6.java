package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 8:02
 */
public class StringDemo6 {
    public static void main(String[] args) {
        //截取字符串
        String s1 = "ajfklsojltmjajgo";
        String result1 = s1.substring(5,10);
        String result2 = s1.substring(5);
        System.out.println(s1);
        System.out.println(result1);
        System.out.println(result2);

    }
}
