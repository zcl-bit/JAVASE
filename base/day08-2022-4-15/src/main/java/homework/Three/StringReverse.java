package homework.Three;

/**
 * @author: zcl
 * @create: 2022/4/16 15:07
 */
public class StringReverse {
    public static void main(String[] args) {
        String s1 = "abcba";
        System.out.println(isSym(s1));
    }
    public static Boolean isSym(String s1){
        if(s1 == null){
            return false;
        }
        StringBuilder sb = new StringBuilder(s1);
        String rb = sb.reverse().toString();
        return rb.equals(s1);
    }
}
