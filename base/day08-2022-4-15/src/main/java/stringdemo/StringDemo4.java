package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 7:56
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String s= "abcdef";
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
