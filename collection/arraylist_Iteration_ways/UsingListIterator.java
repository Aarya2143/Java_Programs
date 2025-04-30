package collection.arraylist_Iteration_ways;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingListIterator {
    public static void main(String[] args) {
        List<String> ar = new ArrayList<>();
        ar.add("Abc");
        ar.add("xyz");
        ar.add("pqs");
        ar.add("stu");

        Iterator<String> itr = ar.listIterator();
        while (itr.hasNext())
        {
            String s = itr.next();
            System.out.println(s);
        }
    }
}
