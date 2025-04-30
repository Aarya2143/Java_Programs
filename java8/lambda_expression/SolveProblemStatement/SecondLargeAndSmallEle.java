package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargeAndSmallEle {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int secondLarg = li.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        int secondSmall = li.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondLarg);
        System.out.println(secondSmall);
    }
}
