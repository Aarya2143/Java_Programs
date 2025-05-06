package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5);

        Object c = in.stream()
                .filter(n -> n%2 == 0)
                .reduce(0,(a,b) -> a+b);

        Object d = in.stream()
                .filter(n -> n%2 != 0)
                .reduce(0,(sum,x)->sum+x);

        System.out.println("sum of all even number: "+c);
        System.out.println("sum of all odd numbers: "+d);
    }
}
