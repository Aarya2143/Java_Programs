package java8.stream;

import java.util.stream.Stream;

public class CreateStreamFromValue {
    public static void main(String[] args) {
        Stream<Integer> addno = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(addno.count());
    }
}
