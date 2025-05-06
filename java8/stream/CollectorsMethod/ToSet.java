package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSet {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Aarya", "Sanjay", "Jadhav", "Aarya", "Revati", "Hindraj", "Sanjay");
        Set<String> str2 = str.stream()
                .collect(Collectors.toSet());
        System.out.println(str2);
    }
}
