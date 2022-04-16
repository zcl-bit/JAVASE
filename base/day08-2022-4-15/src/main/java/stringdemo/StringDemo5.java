package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 7:59
 */
public class StringDemo5 {
    public static void main(String[] args) {
        //定义一个字符串”abc“
        //把abc换为Qbc

        String s = "abc";
        char[] chars = s.toCharArray();
        chars[0]='Q';
        String s2 = new String(chars);
        System.out.println(s2);
    }
}
