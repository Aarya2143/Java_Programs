package java8.stream.staticfactory_methods;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {
        Stream<Integer> num1 = Stream.of(1,2,3,4,5);
        Stream<Integer> num2 = Stream.of(6,7,8,9,10);

        Stream<Integer> num3 = Stream.concat(num1, num2);
        num3.forEach(s -> System.out.println(s));
    }
}
