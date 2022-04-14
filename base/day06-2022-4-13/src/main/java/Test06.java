import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/13 10:40
 * 某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数
 */
public class Test06 {
    public static void main(String[] args) {
        //1、提示用户输入密码
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int temp = password;

        //统计数字位数
        int count = 0;
        while (true) {
            if (password > 0) {
                password /= 10;
                count++;
            } else {
                break;
            }
        }
        //根据输入数字位数声明数组
        int[] arr = new int[count];

        //数据还原
        password = temp;

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = password % 10;

            if (password < 10) {
                password = password % 10;
            } else {
                password /= 10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("数组元素为" + arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
            System.out.print("数组加密后为：" + arr[i] + " ");
        }
        System.out.println();
        for (int i = 0, j = arr.length - 1; i < j; i++) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("数组反转后为：" + arr[i] + " ");
        }

//        //2、对数据进行操作把每位数字都取出来
//        int[] arr= {1,9,8,3};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=(arr[i]+5)%10;
//        }
////        for (int i = arr.length-1; i >=0 ; i--) {
////            System.out.print(arr[i]+" ");
////        }
//        for (int i = 0,j=arr.length-1; i < j; i++) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }


    }
}
