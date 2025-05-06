package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElement {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Aarya","Sanjay","Jadhav","Aarya","Revati","Hindraj","Sanjay");

        List<String> str3 = Collections.singletonList(str.stream()
                .collect(Collectors.joining(", ")));
       System.out.println(str3);
    }
}
