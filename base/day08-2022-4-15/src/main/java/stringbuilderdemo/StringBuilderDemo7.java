package stringbuilderdemo;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 13:52
 */
public class StringBuilderDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //此时因为String这个类中没有直接反转的方法
        //而StringBuilder这个类中有
        //我希望能利用StringBuilder进行反转
        //简单来说：此时就需要用到StringBuilder了
        //那么就把String变成StringBuilder，
        //等反转完毕之后，再转回来
        String result = new StringBuilder().append(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
