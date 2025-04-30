package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

      /* in.stream().filter(n -> n % 2 == 0)
                .forEach(s-> System.out.println(s));*/

        List<Integer> evenNo = in.stream()
                .filter(n-> n%2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNo);
    }
}
