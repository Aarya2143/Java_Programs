package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorForwardDirec {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> list1 = list.listIterator();

        while (list1.hasNext())
        {
            int index = list1.nextIndex();
            String str = list1.next();
            System.out.println("At index: "+index+" Element is: "+str);
        }
    }
}
