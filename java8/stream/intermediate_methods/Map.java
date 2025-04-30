package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("aarya","sanjay","jadhav");

        List<String> li2 = li.stream()
                .map(li3 -> li3.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(li2);
    }
}
