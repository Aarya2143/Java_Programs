package java8.lambda_expression;

interface Demo{
    void div(int a, int b);
}

public class Exceptions
{
    public static void main(String[] args) {
        Demo obj = (a, b)  -> {
            try{
                int c = a/b;
                System.out.println(c);
            }catch (ArithmeticException ex){
                System.out.println("Cant divide by zero");
            }
        };
        obj.div(5,5);
        obj.div(10,0);
    }

}
