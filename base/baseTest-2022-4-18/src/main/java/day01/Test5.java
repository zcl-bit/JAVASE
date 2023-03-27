package day01;

/**
 * @author: zcl
 * @create: 2022/4/18 9:33
 */
public class Test5 {
    public static void main(String[] args) {
        int a = 10;
        {
            a= 20;
            System.out.println(a);
        }
        {
            int b = 20;
            System.out.println(b);
        }
//        b=30;  b为局部变量  不存在在当前作用范围内
//        System.out.println(b);
    }
}
