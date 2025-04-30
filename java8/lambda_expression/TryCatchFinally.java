package java8.lambda_expression;
interface Res{
    void div(int a, int b);
}

public class TryCatchFinally {
    public static void main(String[] args) {
        Res divide = (a,b) -> {
           try{
               int c = a/b;
               System.out.println("Result: "+c);
           } catch (Exception e) {
               System.out.println("Cant divide by zero");
           } finally {
               System.out.println("Finally Block");
           }
        };
        divide.div(10,0);
    }
}
