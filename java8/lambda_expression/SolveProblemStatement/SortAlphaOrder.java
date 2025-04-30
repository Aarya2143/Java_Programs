package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

public class SortAlphaOrder {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("E","D","C","B","A");
        for(String str : li){
            System.out.println(str);
        }
        System.out.println("Sorted Order: ");

        li.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
         for(String str : li){
             System.out.println(str);
         }
    }
}
