/**
 * @author: zcl
 * @create: 2022/4/13 11:47
 */
public class Test08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
