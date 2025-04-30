package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);

        boolean bool = list.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(bool);
    }
}
