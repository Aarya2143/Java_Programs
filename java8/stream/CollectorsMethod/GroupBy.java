package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Aarya","sanjay","jadhav");
        Map<Character, List<String>> grouped = li.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(grouped);

    }
}
