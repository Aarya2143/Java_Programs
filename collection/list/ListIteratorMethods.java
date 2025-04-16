package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");

    ListIterator Iterator = list.listIterator(list.size());

    System.out.println("Previous Iteration");
    while (Iterator.hasPrevious())
    {
        //Object previous(): It returns the previous element in the list and moves the cursor position backward direction.
        // The return type is Object
        System.out.println(Iterator.previous());
    }

    System.out.println("Next Iteration");
    while (Iterator.hasNext())
    {
        //Object next(): This method returns the next element in the list.
        // The return type of next() method is Object.
        System.out.println(Iterator.next());
    }
  }
}
