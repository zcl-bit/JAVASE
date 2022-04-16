package stringdemo;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 7:38
 */
public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        double d = sc.nextDouble();
        System.out.println(d);

        String s1 = "abc";
        String s2 = "bcd";

        System.out.println(s1+s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
