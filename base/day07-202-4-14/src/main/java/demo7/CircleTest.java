package demo7;

/**
 * @author: zcl
 * @create: 2022/4/14 16:05
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadii(1.5);
        System.out.println(c.getRadii());
        c.draw();
    }
}
