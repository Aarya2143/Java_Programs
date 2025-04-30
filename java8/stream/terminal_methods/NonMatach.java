package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;

public class NonMatach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);

        boolean result = list.stream()
                .noneMatch(n -> n%2 == 0);

        System.out.println(result);
    }

}
