package stringtest;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:24
 */
public class Test2 {
    public static void main(String[] args) {
        //1、定义正确的用户名和密码
        String rightUsername = "admin";
        String rightPassword = "123456";

        //2、键盘录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userInput = sc.next();
            System.out.println("请输入密码");
            String passwordInput = sc.next();
            if (rightUsername.equals(userInput) && rightPassword.equals(passwordInput)){
                System.out.println("登录成功");
            }else{
                if (i == 2){
                    System.out.println("您的账户"+ userInput + "被锁定，请联系管理员");
                }else{
                    System.out.println("用户名或密码错误，请重新输入，您还剩下"+(2-i)+"次机会");
                }
            }
        }
    }
}
