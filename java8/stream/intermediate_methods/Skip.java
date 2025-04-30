package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Aarya","sanjay","jadhav","hindraj");

        List<String> li2 = li.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(li2);
    }
}
