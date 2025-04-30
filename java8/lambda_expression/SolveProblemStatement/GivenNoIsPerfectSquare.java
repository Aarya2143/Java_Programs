package java8.lambda_expression.SolveProblemStatement;

import java.util.function.Predicate;

public class GivenNoIsPerfectSquare {
    public static void main(String[] args) {
        Predicate<Integer> isPerfect = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        int n = 36;
        boolean result = isPerfect.test(n);
        System.out.println("Number is perfect square? : "+result);

        int a = 26;
        boolean result1 = isPerfect.test(a);
        System.out.println("Number is perfect square? :"+result1);
    }
}
