package collection.linkedlist.IterationWays;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class UsingListIterator {
    public static void main(String[] args) {
        List<String> obj = new LinkedList<>();
        obj.add("ftf");
        obj.add("yuy");
        obj.add("gyf");

        ListIterator<String> iter = obj.listIterator();

// ----------------------------- for previous me need to forward first ----------------------------

        while (iter.hasNext()){
            iter.next();
        }
        while (iter.hasPrevious()){
            Object o1 = iter.previous();
            System.out.println(o1);
        }

// ------------------------------------- Use for next ----------------------------------------------

        while (iter.hasNext()){
            Object o = iter.next();
            System.out.println(o);
        }
    }
}
