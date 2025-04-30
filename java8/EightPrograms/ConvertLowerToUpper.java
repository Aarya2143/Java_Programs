package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerToUpper {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("aarya sanjya jadhav");

        List<String> result = str.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
