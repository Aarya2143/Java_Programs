package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Integer> in1 = in.stream()
                .filter(n -> n% 2 == 0)
                .collect(Collectors.toList());

        System.out.println(in1);
    }
}
