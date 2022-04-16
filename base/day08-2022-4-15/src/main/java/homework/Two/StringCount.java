package homework.Two;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:55
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个
 */
public class StringCount {
    public static void main(String[] args) {
        System.out.println("请录入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        method(s1);

    }
    private static void method(String s1){
        //定义计数器
        int numberCount = 0;
        int stringCount = 0;
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (c1 >= '0' && c1<='9'){
                numberCount++;
            }else if(c1 >='A' && c1<='z'){
                stringCount++;
            }
        }
        System.out.println("中英文字母有："+stringCount);
        System.out.println("数字有："+numberCount);

    }
}
