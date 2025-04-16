package collection.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffAddAddAll {
    public static void main(String[] args) {

        List<Object> list1 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D"));

      /*  list1.add(list2);
        System.out.println(list1); //[A,B[C,D]]

        list1.addAll(list2);
        System.out.println(list1);//[A,B,C,D]*/

        list1.remove(list2);
        System.out.println(list1);

        list1.removeAll(list2);
        System.out.println(list1);
    }
}
