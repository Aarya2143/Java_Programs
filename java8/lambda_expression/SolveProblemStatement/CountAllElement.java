package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class CountAllElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Object obj = list.stream()
                .reduce(0,(a,b) -> a+b);

        Object obj1 = list.stream()
                        .reduce(1,(a,b) -> a*b);

        System.out.println("Addition all elements: "+obj);
        System.out.println("Multiply all elements: "+obj1);
    }
}
