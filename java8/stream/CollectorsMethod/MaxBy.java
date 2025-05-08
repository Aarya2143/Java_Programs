package java8.stream.CollectorsMethod;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxBy {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aarya","jadhav","hindraj","reavti","aarti");
        String res = String.valueOf(names.stream()
                .collect(Collectors.maxBy(Comparator.reverseOrder())));
                /*.collect(Collectors.groupingBy(s -> s.startsWith("a")))
                .toString();*/

        System.out.println(res);
    }
}
