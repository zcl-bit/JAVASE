/**
 * @author: zcl
 * @create: 2022/4/18 13:43
 *          *
 *         * *
 *        * * *
 *       * * * *
 *        * * *
 *         * *
 *          *
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 4; i >= 1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (9-2*i); j++) {
                if (j%2==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (9-2*i) ; j++) {
                if (j%2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
