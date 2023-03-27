package day02;

/**
 * @author: zcl
 * @create: 2022/4/18 13:39
 */
public class Test {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1;i <= 10;i++) {
            if(i % 5 == 0) {
                break;
            }
            if (i == 3 || i == 7 || i == 9){
                continue;
            }
            count++;  // i = 1 , 2  , 4
        }
        System.out.println(count);
    }
}
