package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);

        Optional<Integer> obj = list.stream().
                findFirst();

        System.out.println(obj.get());
    }
}
