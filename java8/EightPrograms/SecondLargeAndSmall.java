package java8.EightPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SecondLargeAndSmall {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,3,4,6,8,2,4,1,5,10,7);
        numbers.stream()
                .sorted()
                .limit(2)
                .skip(1)
                .forEach(s -> System.out.println("Second small no: "+s));

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .forEach(s -> System.out.println("Second large no: "+s));
    }
}
