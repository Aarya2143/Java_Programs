package java8.stream.PracticeSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSorting {
    public static void main(String[] args) {
       /* List<String> color = Arrays.asList("red","blue","orange","white","green","yellow");
          color.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s));*/

        /* List<Integer> number = Arrays.asList(5,9,12,3,2,4);
        List<Integer> reversed = number.stream()
                .sorted((a,b)-> b-a)
                .collect(Collectors.toList());
        System.out.println(reversed);*/

        List<Integer> num = Arrays.asList(2,4,6,8,10,1,3,5,7,9);

        Collections.sort(num, Collections.reverseOrder());

        System.out.println(num);

    }
}
