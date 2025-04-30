package java8.lambda_expression;

interface Inter{
    void test(int a, int b);
}
public class PrameterizedLE {
    public static void main(String[] args) {
        Inter obj = (a, b) ->
        {
            int c = a+b;
            System.out.println("addition: "+c);
        };

        obj.test(10,20);
    }
}
