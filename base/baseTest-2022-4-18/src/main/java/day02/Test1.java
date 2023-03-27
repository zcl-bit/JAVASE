package day02;

/**
 * @author: zcl
 * @create: 2022/4/18 9:58
 */
public class Test1 {
    public static void main(String[] args) {
        double money1 = 24 + 8 + 3;
        double money2 = (money1 >= 30 ? money1 * 0.8 : money1);
        double money3 = 16 + 8 + 3;
        double money = money2>money3?money3:money2;
        System.out.println(money);
    }
}
