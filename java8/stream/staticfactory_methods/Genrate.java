package java8.stream.staticfactory_methods;

import java.util.stream.Stream;

public class Genrate {
    public static void main(String[] args) {
        Stream.generate(() -> "Hiii")
                .limit(3)
                .forEach(s -> System.out.println(s));
    }
}
