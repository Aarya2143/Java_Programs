package collection.arraylist_method;

import java.util.ArrayList;
import java.util.List;

public class AddAllIndexCollection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        System.out.println(list1.addAll(list1));
    }
}
