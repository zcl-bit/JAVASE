package stringtest;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:29
 */
public class Test3 {
    public static void main(String[] args) {
        //键盘录入一个手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号码");
        String phoneNum = sc.next();
        String start = phoneNum.substring(0,3);
        String end = phoneNum.substring(7);
        String result = start + "****"+end;
        System.out.println(result);
    }
}
