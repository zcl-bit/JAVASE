package stringbuilderdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 10:54
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");
        sb.append(1.1);
        sb.append(true);

        System.out.println(sb);
    }
}
