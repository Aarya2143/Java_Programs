package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Norm{
    void upper();
}

public class LowercaseToUppercase {
    public static void main(String[] args) {
        List<String> strlist = Arrays.asList("RED","GREEN","BLUE","WHITE","YELLOW");
        for(String str : strlist){
            System.out.println(str);
        }
        strlist.replaceAll(str -> str.toLowerCase());

        System.out.println("\nAfter Convertion: ");
        for (String str : strlist){
            System.out.println(str);
        }
    }
   /* public static void main(String[] args) {
      Norm obj = () -> {
          System.out.println();
          String s2 = "aarya";
          System.out.println(s2.toUpperCase());
      };
      obj.upper();
    } */
}
