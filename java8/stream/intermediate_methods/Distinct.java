package java8.stream.intermediate_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> inte = Arrays.asList(1,2,3,4,2,4,5,6,7,5,7,8,9,10);

        List<Integer> result = inte.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
