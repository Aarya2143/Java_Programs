package java8.stream.SpecializedOperation;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Sum {
    public static void main(String[] args) {
        List<String> n = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        OptionalInt inte = OptionalInt.of(n.stream()
                .mapToInt(i -> Integer.parseInt(i))
                .sum());

        System.out.println(inte);
    }
}
