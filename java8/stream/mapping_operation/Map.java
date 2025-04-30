package java8.stream.mapping_operation;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("akj");
        str.add("hgtsy");
        str.add("gtfrst");
        str.add("esabj");
        str.add("csad");

        str.stream()
                .map((String::length))
                .forEach(s-> System.out.println("length of element is: "+s));
    }
}
