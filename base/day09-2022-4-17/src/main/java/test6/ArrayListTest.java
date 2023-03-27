package test6;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/18 8:08
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String u = list.get(i);
            if (u == "b") {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
