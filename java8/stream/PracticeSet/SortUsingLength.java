package java8.stream.PracticeSet;

import java.util.*;

public class SortUsingLength {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("aarya");
        str.add("sanjay");
        str.add("jadhav");
        str.add("hindraj");
        str.add("revati");

       /* str.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(s -> System.out.println(s));*/

        /*str.stream()
                .sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))
                .forEach(s -> System.out.println(s));*/


    }
}
