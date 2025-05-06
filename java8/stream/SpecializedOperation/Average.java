package java8.stream.SpecializedOperation;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("1","2","3","4","5","6");
        OptionalDouble doub = str.stream()
                .mapToDouble(i->Double.parseDouble(i))
                .average();
        System.out.println(doub);
    }
}
