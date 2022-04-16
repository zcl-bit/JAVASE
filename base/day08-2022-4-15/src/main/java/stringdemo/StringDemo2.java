package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 7:41
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("@@" + s1 + "--");

        String s2 = new String("abc");
        System.out.println(s2);

        //把字符数组变成字符串
        char[] chars = {'a','b','c','d','e','f','g'};
        String s3 = new String(chars);
        System.out.println(s3);

        //字节数组变成字符串
        byte[] bytes = {97,98,99};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
