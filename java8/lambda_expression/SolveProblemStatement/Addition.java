package java8.lambda_expression.SolveProblemStatement;

@FunctionalInterface
interface Inter{
    void add(int a, int b);
}
public class Addition {
    public static void main(String[] args) {
        Inter obj = (a, b) -> {
            int c = a+b;
            System.out.println(c);
        };
        obj.add(10,10);
    }
}
