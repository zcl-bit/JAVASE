package demo9;

/**
 * @author: zcl
 * @create: 2022/4/14 16:10
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setPrice(1998);
        p1.setColor("黑");
        p1.call();
        p1.sendMessage();

        Phone p2 = new Phone("华为",9988,"白");
        p2.call();
        p2.sendMessage();

    }
}
