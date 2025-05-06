package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Aarya","Sanjay","Jadhav","Aarya","Revati","Hindraj","Sanjay");
        List<String> str1 = str.stream()
                .collect(Collectors.toList());
        System.out.println(str1);
    }
}
