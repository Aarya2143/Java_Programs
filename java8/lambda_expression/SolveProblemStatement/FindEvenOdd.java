package java8.lambda_expression.SolveProblemStatement;

import java.util.Arrays;
import java.util.List;

interface Even{
    void even();
}

public class FindEvenOdd {
    public static void main(String[] args) {
        List<Integer> obj = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Even on = () -> {
            for(int i=0 ; i< obj.size(); i++){
                if(obj.get(i) % 2 == 0){
                    System.out.println(obj.get(i));
                }
            }
        };
        System.out.println("Even number in list is: ");
        on.even();
    }
}
