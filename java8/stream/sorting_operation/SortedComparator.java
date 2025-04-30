package java8.stream.sorting_operation;

import java.util.ArrayList;
import java.util.List;

public class SortedComparator {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("akj");
        str.add("hgtsy");
        str.add("gtfrst");
        str.add("esabj");
        str.add("csad");
        str.add("sk");

        str.stream()
                .sorted((String name1, String name2) -> name1.length() - name2.length())
                .forEach(s -> System.out.println(s));

    }
}
