package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorReverseDirec {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("a");
        obj.add("b");
        obj.add("c");
        obj.add("d");
        obj.add("e");

        ListIterator<String> itr = obj.listIterator(obj.size());
        while (itr.hasPrevious())
        {
            int index = itr.previousIndex();
            String ele = itr.previous();
            System.out.println("At index: "+index+" Element is: "+ele);
        }
    }
}
