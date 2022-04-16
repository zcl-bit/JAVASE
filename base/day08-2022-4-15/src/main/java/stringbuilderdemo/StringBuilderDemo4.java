package stringbuilderdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 11:16
 */
public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1345679");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
