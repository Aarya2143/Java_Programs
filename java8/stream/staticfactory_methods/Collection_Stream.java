package java8.stream.staticfactory_methods;

import java.util.Arrays;
import java.util.List;

public class Collection_Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        list.stream()
                .forEach(s -> System.out.println(s));
    }
}
