package test5;

import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/4/18 7:59
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("0001","张三","123456");
        User u2 = new User("0002","李四","123456");
        User u3 = new User("0003","王五","123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = contains(list,"0001");
        System.out.println(index);

    }
    public static int contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;

            }
        }
        return -1;
    }
}
