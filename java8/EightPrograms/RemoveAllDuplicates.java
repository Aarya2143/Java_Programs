package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveAllDuplicates {
    public static void main(String[] args) {
       /*List<String> fruits = Arrays.asList("apple","banana","kiwi","cherry","apple","kiwi","orange");
       List<String> unique = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Result: "+unique);*/


        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,8,9);

        List<Integer> unique = Stream.concat(list1.stream(), list2.stream())
                .filter(i-> !((list1).contains(i) && (list2).contains(i)))
                //contain only unique which not present in list1 and list2
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
