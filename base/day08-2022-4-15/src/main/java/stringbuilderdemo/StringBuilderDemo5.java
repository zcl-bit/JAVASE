package stringbuilderdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 11:26
 */
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "ccc";

        String result = s1+s2+s3;
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        //把stringBuilder转为String
        String result1 = sb.toString();
        System.out.println(result1);

    }
}
