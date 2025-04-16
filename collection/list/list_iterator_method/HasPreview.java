package collection.list.list_iterator_method;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HasPreview {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator Iterator = list.listIterator(list.size());

        System.out.println("Previous Iteration");

        //Object previous(): It returns the previous element in the list and moves the cursor position backward direction.
        // The return type is Object.

        while (Iterator.hasPrevious())
        {
            System.out.println(Iterator.previous());
        }
    }
}
