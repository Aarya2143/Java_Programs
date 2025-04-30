package java8.lambda_expression.SolveProblemStatement;

interface Interf{
    void check();
}
public class CheckStringIsEmpty {
    public static void main(String[] args) {
        Interf obj = () -> {
          String s1 = "";
          if(s1 == ""){
              System.out.println("String is empty");
          }else{
              System.out.println(s1);
          }
        };
        obj.check();
    }
}
