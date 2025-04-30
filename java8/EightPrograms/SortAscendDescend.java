package java8.EightPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscendDescend {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aarya","Sanjay","Jadhav","Revati","Hindraj");
        List<String> ascend = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted in Ascending  oreder: "+ascend);

        List<String> descend = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted in descending oreder: "+ descend);
    }
}
