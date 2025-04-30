package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class AverageLengthInString {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Aarya","Sanjay","Jadhav","Hindraj","revati");

        double averagelength = li.stream()
                    .mapToInt(String:: length)
                    .average()
                    .orElse(0);

        System.out.println(averagelength);
    }
}
