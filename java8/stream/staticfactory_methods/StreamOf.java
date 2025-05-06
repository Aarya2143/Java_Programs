package java8.stream.staticfactory_methods;

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("1","2","3","4","5");

        str.sorted()
                .forEach(s -> System.out.println(s));
    }
}
