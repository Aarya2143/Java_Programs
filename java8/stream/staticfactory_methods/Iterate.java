package java8.stream.staticfactory_methods;

import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
      Stream.iterate(2,n -> n+2)
              .limit(10)
              .forEach(System.out::println);
    }
}
