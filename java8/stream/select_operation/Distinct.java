package java8.stream.select_operation;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("aarya");
        name.add("sakshi");
        name.add("nikita");
        name.add("sandhya");
        name.add("megha");
        name.add("sandhya");
        name.add("aarya");

        name.stream()
                .filter((String s )-> s.length() > 5)
                .distinct()
                .forEach(a -> System.out.println(a));
    }
}
