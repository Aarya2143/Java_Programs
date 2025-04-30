package java8.lambda_expression.SolveProblemStatement;
@FunctionalInterface
interface Inetr{
    void concatString(String a, String b);
}

public class ConcatStrings {
    public static void main(String[] args) {
        Inetr o = (a,b) -> {
            String result = a + b;
            System.out.println(result);
        };
        o.concatString("Aa","rya");
    }

}
