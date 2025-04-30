package java8.EightPrograms;

import java.util.Arrays;
import java.util.List;

public class StartsWithSecificLetter {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("aarya","sanjay","jadhav","akshay","kriti","kirti","hin");
        Long count = str.stream()
                 .filter(a -> a.startsWith("k"))
                 .count();
        System.out.println("No of string starts with 'a' is : " +count);
    }
}
