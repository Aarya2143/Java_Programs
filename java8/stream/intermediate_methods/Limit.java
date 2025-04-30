package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("aarya","sanjay","jadhav","revati");

        List<String> limitlist = name.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(limitlist);
    }
}
