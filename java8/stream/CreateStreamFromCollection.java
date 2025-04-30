package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class CreateStreamFromCollection {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Aarya");
        str.add("sanjay");
        str.add("jadhav");

        str.stream()
                .forEach(System.out::println);
    }
}
