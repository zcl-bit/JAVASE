package demo1;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/17 14:42
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
//        boolean result = list.remove("bbb");
//        System.out.println(result);
        String result1 = list.remove(1);
        System.out.println(result1);
        System.out.println(list);

    }
}
