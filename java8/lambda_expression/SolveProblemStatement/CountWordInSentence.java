package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;

public class CountWordInSentence {
    public static void main(String[] args) {
        String  s =" java is a programming language ";

        Long count = Arrays.stream(s.trim().split(" "))
                .count();

        System.out.println(count);
    }
}
