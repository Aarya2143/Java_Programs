package java8.stream.select_operation;

import java.util.ArrayList;
import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List<String> name1 = new ArrayList<>();
        name1.add("aarya");
        name1.add("aarya");
        name1.add("sakshi");
        name1.add("nikita");
        name1.add("sandhya");
        name1.add("megha");
        name1.add("sandhya");
        name1.add("kirti");

        name1.stream()
                .distinct()
                .limit(2)
                .forEach(s -> System.out.println(s));
    }
}
