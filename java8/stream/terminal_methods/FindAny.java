package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10,12,14,16,18);

        Optional<Integer> integer = list.stream()
                .findAny();

        System.out.println(integer.get());
    }
}
