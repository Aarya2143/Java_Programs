package collection.list.list_iterator_method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RemoveCpabilityMeth {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> itr = list.listIterator();
       //  boolean p = itr.hasNext();

         int index = itr.nextIndex();
         String ele = itr.next();
         System.out.println("at index: "+index+ " element present: "+ele);
    }
}
