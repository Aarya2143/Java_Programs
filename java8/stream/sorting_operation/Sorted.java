package java8.stream.sorting_operation;

import java.util.ArrayList;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("akj");
        str.add("hgtsy");
        str.add("gtfrst");
        str.add("esabj");
        str.add("csad");

        str.stream()
                .distinct()
                .sorted()
                .forEach(s -> System.out.println(s));
    }

}
