package java8.lambda_expression;

interface Sample{
    int add(int a, int b);
}

public class UsingReturnType {
    public static void main(String[] args) {
       Sample sam = (a, b) ->  {
             int c = a+b;
             System.out.println(c);
             return c;
        };
       sam.add(10,20);
    }
}
