package java8.lambda_expression.SolveProblemStatement;

import java.util.function.Function;

public class ConvertIntToBinary {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Number is: "+n);

        Function<Integer, String> convertBinary = num -> Integer.toBinaryString(num);
        String Binary = convertBinary.apply(n);
        System.out.println("Binary format of "+ n + " is: " +Binary);
    }
}
