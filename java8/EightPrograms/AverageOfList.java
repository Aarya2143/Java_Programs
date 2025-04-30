package java8.EightPrograms;

import java.util.*;

public class AverageOfList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        if(!numbers.isEmpty()){
            double sum = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            double avg = sum / numbers.size();
            System.out.println("Average No: "+avg);
        } else
        {
            System.out.println("empty list");
        }

        /*OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Average : "+average.getAsDouble());

        if(average.isPresent()){
            System.out.println("Average : "+average.getAsDouble());
        }else {
            System.out.println("List is empty avg not vailable");
        }*/

    }
}
