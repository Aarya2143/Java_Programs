package java8.stream.SpecializedOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
    //    List<String> range = Arrays.asList("1","2","3","4","5","6","7");
        IntStream stream = IntStream.range(1,4);
        stream.forEach(System.out::println);

    }
}
