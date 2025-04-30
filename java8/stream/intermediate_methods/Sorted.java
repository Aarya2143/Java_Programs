package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,3,6,7,9,1,4,8,10);

        List<Integer> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
