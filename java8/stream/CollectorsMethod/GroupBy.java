package java8.stream.CollectorsMethod;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        /*List<String> li = Arrays.asList("Aarya","sanjay","jadhav");
        Map<Character, List<String>> grouped = li.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        System.out.println(grouped);*/

        String s = "abcdabcbaaaddd";
        List<Character> charList = new ArrayList<>();

        for(char c : s.toCharArray()){
            charList.add(c);
        }
        //System.out.println(charList);

       Map<Character,Long> result = charList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
