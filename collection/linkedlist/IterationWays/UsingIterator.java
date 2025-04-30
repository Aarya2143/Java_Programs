package collection.linkedlist.IterationWays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsingIterator {
    public static void main(String[] args) {
        List<String> obj = new LinkedList<>();
        obj.add("ftf");
        obj.add("yuy");
        obj.add("gyf");

        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
