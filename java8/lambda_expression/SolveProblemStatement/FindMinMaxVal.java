package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMinMaxVal {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12,34,2,76,34,23,90);

        System.out.println("Original list: "+li);

        Optional<Integer> max = li.stream()
                .max((x,y)->x.compareTo(y));

        Optional<Integer> min = li.stream()
                .min((x,y)-> x.compareTo(y));

        System.out.println("Maximum value: "+max.orElse(null));
        System.out.println("Minimum value: "+min.orElse(null));
    }
}
