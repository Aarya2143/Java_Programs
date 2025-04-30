package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllDuplicates {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","kiwi","cherry","apple","kiwi","orange");
        List<String> unique = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Result: "+unique);
    }
}
