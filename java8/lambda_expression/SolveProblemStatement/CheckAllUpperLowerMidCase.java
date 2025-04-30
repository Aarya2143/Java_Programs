package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckAllUpperLowerMidCase {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("java","Java","JAVA");

         List<String> Upper = li.stream()
                .filter(s -> s.equals(s.toUpperCase()))
                 .collect(Collectors.toList());

         List<String> lower = li.stream()
                 .filter(s -> s.equals(s.toLowerCase()))
                 .collect(Collectors.toList());

         List<String> Mid = li.stream()
                 .filter(s -> !s.equals(s.toLowerCase()) && !s.equals(s.toUpperCase()))
                 .collect(Collectors.toList());

          System.out.println(Upper);
          System.out.println(lower);
          System.out.println(Mid);
    }
}
