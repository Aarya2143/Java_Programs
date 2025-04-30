package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5);

        Object c = in.stream()
                .reduce(3,(a,b) -> a+b);

        System.out.println(c);
    }
}
