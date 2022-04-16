package stringtest;

import java.util.Properties;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:38
 */
public class Test6 {
    public static void main(String[] args) {
        //获取身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String personID = sc.next();
        //获取年月日
        String year = personID.substring(6,10);
        String month = personID.substring(10,12);
        String day = personID.substring(12,14);
        System.out.println("这个人的出生年月日为；"+year + "年"+month+"月"+day+"日");
        //性别
        char c = personID.charAt(personID.length()-1);
        if ((c - '0')%2 == 0){
            System.out.println("妹子");
        }else{
            System.out.println("汉子");
        }
    }
}
