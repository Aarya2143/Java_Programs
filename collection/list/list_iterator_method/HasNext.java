package collection.list.list_iterator_method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HasNext {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> listIterator = list.listIterator();
        System.out.println("-----------  ITERATE IN FORWARD DIRECTION  ---------");

        boolean Elementpresent = listIterator.hasNext();
        System.out.println(Elementpresent);

        //Object next(): It returns the next element in the list and moves the cursor position forward direction.
        //The return type is Object.

        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

    }
}
