package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       /* List<Integer> even = numbers.stream()
                .filter(s-> s%2 == 0)
                .collect(Collectors.toList());
        System.out.println(even.stream().mapToInt(Integer::intValue).sum());

        List<Integer> odd = numbers.stream()
                .filter(n -> n %2 != 0)
                .collect(Collectors.toList());
        System.out.println(odd.stream().mapToInt(Integer::intValue).sum());*/

        Object evenno = numbers.stream()
                .filter(n -> n%2 == 0)
                .reduce(0, (a,b) -> a+b);
        System.out.println("even no sum using reduce: "+evenno);

        Object oddno = numbers.stream()
                .filter(n -> n%2 != 0)
                .reduce(0,(a,b)->a+b);
        System.out.println("even no sum using reduce: "+oddno);

    }
}
