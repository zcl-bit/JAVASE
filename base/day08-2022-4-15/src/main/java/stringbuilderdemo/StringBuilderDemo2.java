package stringbuilderdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 9:50
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("@" + sb + "-");

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}
