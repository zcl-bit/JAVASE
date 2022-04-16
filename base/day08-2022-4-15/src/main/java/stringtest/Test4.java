package stringtest;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/4/16 14:31
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要说的话");
        String talk = sc.next();

        String result = method(talk);
        System.out.println(result);
    }
    private static String method(String talk){
        String[] arr ={"TMD","MD","SB","CNM","CNMD","NT","CAO","CNM"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"****");

        }
        return talk;
    }
}
