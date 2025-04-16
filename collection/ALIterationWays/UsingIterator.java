package collection.ALIterationWays;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Abc");
        arr.add("xyz");
        arr.add("pqs");
        arr.add("stu");

        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()){
            String st=itr.next();
            System.out.println(st);
        }
    }
}
