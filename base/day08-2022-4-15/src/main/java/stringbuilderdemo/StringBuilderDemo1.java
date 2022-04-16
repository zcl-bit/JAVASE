package stringbuilderdemo;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 9:30
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s = "";
//        for (int i = 0; i < 100000000; i++) {
//            s = s + "abc";
//        }
//        System.out.println(s);
//
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
