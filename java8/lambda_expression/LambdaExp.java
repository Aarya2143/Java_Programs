package java8.lambda_expression;

interface NormalInter{
    void test();
}

public class LambdaExp  {
    public static void main(String[] args) {
        NormalInter obj = () -> {
           System.out.println("Test msg using lambda");
       };

        obj.test();
    }
}
