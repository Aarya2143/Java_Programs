package java8.stream.select_operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        /*List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);*/

        /*numbers.stream()
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.println(n));*/

        List<String> str = Arrays.asList("Apple","banana","kiwi","orange","papaya");
        str.stream()
                .filter((String name)-> name.length()<=5)
                .forEach(s-> System.out.println(s));
    }
}
