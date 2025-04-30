package collection.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<String> li = new HashSet<>();
        li.add("D");
        li.add("C");
        li.add("B");
        li.add("A");
        li.add("B");

        System.out.println(li);

    }
}
