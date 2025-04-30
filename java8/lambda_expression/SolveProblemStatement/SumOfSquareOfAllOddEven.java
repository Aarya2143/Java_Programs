package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfAllOddEven {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumofeven = li.stream()
                .filter(n -> n % 2 == 0)      //check num is even
                .mapToInt(n -> n * n)         //check square of no
                .sum();

        int sumofodd = li.stream()
                .filter(n -> n%2 != 0)       //check num is odd
                .mapToInt(n -> n*n)          //check square of no
                .sum();

        System.out.println("Even no sum: "+sumofeven);
        System.out.println("Odd no sum: "+sumofodd);
    }
}
