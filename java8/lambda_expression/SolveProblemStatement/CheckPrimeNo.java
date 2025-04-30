package java8.lambda_expression.SolveProblemStatement;

import java.util.function.IntPredicate;

public class CheckPrimeNo {
    public static void main(String[] args) {
        int Number = 7;

        IntPredicate isprime = n -> {
            if(n<=1) return false;
            for (int i=2 ; i<=Math.sqrt(n); i++ ){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        };

        if(isprime.test(Number)){
            System.out.println("Number is prime: "+Number);
        }else {
            System.out.println(Number+": is Not prime.");
        }
    }
}
