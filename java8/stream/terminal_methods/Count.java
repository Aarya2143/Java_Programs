package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(2,3,5,6,7,9,6,4,9,6,4,6,7,4,3,2,4,6,8,8,9,0);
        Object obj = li.stream()
                .distinct()
                .count();

        System.out.println(obj);
    }
}
