package stringdemo;

/**
 * @author: zcl
 * @create: 2022/4/16 8:06
 */
public class StringDemo9 {
    public static void main(String[] args) {
        String s1 = "abc";//记录的是字符串常量池中的地址值
        String s2 = new String("abc");//记录的是new出来的堆中的地址值
    }
}
