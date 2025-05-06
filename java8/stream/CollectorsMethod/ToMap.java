package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Aarya","Sanjay","Jadhav","Revati","Hindraj");
        Map<String, Integer> peoples = str.stream()
                .collect(Collectors.toMap(n -> n , n -> n.length() ));
        System.out.println(peoples);
    }
}
