package java8.stream.staticfactory_methods;

import java.util.stream.Stream;

public class Stream_Empty {
    public static void main(String[] args) {
        Stream<String> integerStream = Stream.empty();
        integerStream.forEach(s -> System.out.println(s));
    }
}
