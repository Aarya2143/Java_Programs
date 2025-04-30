package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class CheckContainSpecificWord {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("java is a programming language");

        boolean b = str.stream()
                .anyMatch(s -> s.contains("a"));

        System.out.println(b);
    }
}
