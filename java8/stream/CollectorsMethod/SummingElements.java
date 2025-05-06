package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingElements {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = a.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}
