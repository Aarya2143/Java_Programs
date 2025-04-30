package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageDouble {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.1,2.1,3.1,4.1,5.1);
        OptionalDouble opp = numbers.stream()
                .mapToDouble(n -> n)
                .average();

        if(opp.isPresent()){
            System.out.println("present: "+opp.getAsDouble());
        }else {
            System.out.println("List is empty");
        }
    }
}
