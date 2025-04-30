package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,3,4,6,8,2,4,1,5,10,7);

        Optional<Integer> maximum = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Maximum number in list: "+ maximum);

        Optional<Integer> minimum = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("Minimum number in list: "+ minimum);
    }
}
