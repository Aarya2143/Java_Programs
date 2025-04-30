package java8.stream;

import java.util.stream.Stream;

public class CreateEmptyStream {
    public static void main(String[] args) {
        Stream<CreateEmptyStream> str = Stream.empty();
        System.out.println(str.count());
    }
}
