package collection.linkedlist.PracticeProg;

import java.util.LinkedList;
import java.util.List;

public class AllAddMethods {
    public static void main(String[] args) {
        List<String> str = new LinkedList<>();
        str.add(0,"aa");
        str.add(1,"bb");
        str.add(2,"cc");
        str.add(3,"dd");
        System.out.println(str);

        str.add(4,"ee");
        System.out.println(str);

        List<String> list1 = new LinkedList<>();
        list1.addAll(str);
        System.out.println(list1);

        List<String> list2 = new LinkedList<>();
        list2.addAll(0,str);
        System.out.println(list2);
    }
}
