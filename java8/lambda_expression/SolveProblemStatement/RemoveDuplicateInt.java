package java8.lambda_expression.SolveProblemStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateInt {
    public static void main(String[] args) {
        List<Integer> inte = Arrays.asList(1,2,3,3,4,5,6,2);

        System.out.println("Original: "+inte);

        List<Integer> unique = new ArrayList<>();

        inte.stream()
                .distinct()
                .forEach(unique::add);

        System.out.println("Duplicates: "+unique);
    }
}
