package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class LengthLongSmallString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","kiwi","papaya","watermelon");
        int large = str.stream()
                .mapToInt(String :: length)
                .max()
                .orElse(0);

        int small = str.stream()
                .mapToInt(String:: length)
                .min()
                .orElse(0);

        System.out.println("max length is: "+large);
        System.out.println("min length is: "+small);
    }
}
