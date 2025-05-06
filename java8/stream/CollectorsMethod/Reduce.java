package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int count = values.stream()
                .collect(Collectors.reducing(0, (a,b) -> a+b));

        System.out.println(count);
    }
}
