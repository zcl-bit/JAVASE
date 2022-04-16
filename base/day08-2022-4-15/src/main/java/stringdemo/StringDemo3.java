package stringdemo;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 7:48
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String rightUsername = "zcl";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个用户名");
        String userInput = sc.next();

        System.out.println(rightUsername == userInput);
        boolean result = userInput.equals(rightUsername);
        System.out.println(result);
        //忽略大小写的区别的
        boolean result2 = userInput.equalsIgnoreCase(rightUsername);
        System.out.println(result2);
    }
}
