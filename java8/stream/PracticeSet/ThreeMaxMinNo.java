package java8.stream.PracticeSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxMinNo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,3,5,7,6,8,9,10,1);


        /*List<Integer> result = number.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> result1 = number.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(result1);*/

          /*Object o1 = number.stream()
                .sorted()
                  .limit(3)
                  .collect(Collectors.toList());
          System.out.println("Min no in list: "+o1);

          Object o2 = number.stream()
                  .sorted(Collections.reverseOrder())
                  .limit(3)
                  .collect(Collectors.toList());
          System.out.println("Max no in list: "+o2);*/
    }
}
