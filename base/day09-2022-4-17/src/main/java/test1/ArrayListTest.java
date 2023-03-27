package test1;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/17 16:14
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
