package java8.stream.PracticeSet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> fruit = Arrays.asList("apple","banana","cherry","banana","kiwi","pinapple","apple");
        /*fruit.stream()
                .distinct()
                .forEach(s -> System.out.println(s));*/


        /*List<String> uniq  = IntStream.range(0, fruit.size())
                .filter(i -> fruit.indexOf(fruit.get(i))== i)
                .mapToObj(fruit::get)
                .collect(Collectors.toList());
        System.out.println(uniq);*/


        Set<String> uniq = new LinkedHashSet<>(fruit);
        List<String> result = new ArrayList<>(uniq);
        System.out.println(result);
    }
}
