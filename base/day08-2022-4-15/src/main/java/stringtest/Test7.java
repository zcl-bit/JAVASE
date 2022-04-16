package stringtest;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:43
 */
public class Test7 {
    public static void main(String[] args) {
        //统计字符串中大写字母、小写字母、数字、其他字符有多少个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A'&& c<='Z'){
                bigCount++;
            }else if(c >='a' && c<='z'){
                smallCount++;
            }else if(c >= '0' && c<='9'){
                numberCount++;
            }else {
                otherCount++;
            }

        }
        //3.输出打印
        System.out.println("大写字符有：" + bigCount + "个");
        System.out.println("小写字符有：" + smallCount + "个");
        System.out.println("数字字符有：" + numberCount + "个");
        System.out.println("其他字符有：" + otherCount + "个");
    }
}
