package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
    public static void main(String[] args) {
        List<Integer> str = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> s = str.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(s);
    }
}
