package demo1;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/17 14:58
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.remove("ddd");
        list.remove(1);
        System.out.println(list);
    }
}
