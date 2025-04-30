package java8.lambda_expression;

interface Rsult{
    void str() throws NullPointerException;
}

public class ThrowsExp {
    public static void main(String[] args) {
        Rsult obj = ()  -> {
               String s = null;
               System.out.println(s.length());
        };
        obj.str();
    }
}
