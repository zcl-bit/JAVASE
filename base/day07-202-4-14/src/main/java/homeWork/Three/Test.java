package homeWork.Three;

/**
 * @author: zcl
 * @create: 2022/4/14 16:38
 */
public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("张三",123,15000,60000);
        m1.work();
        Coder c1 = new Coder("李四",135,150000);
        c1.work();
    }
}
