package java8.stream.terminal_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("aarya");
        li.add("sanjay");
        li.add("jadhav");
        li.add("system");
        li.add("java");
        li.add("okku");
        li.add("aan");
        li.add("jadhav");
        li.add("okku");

        Object[] arr = li.stream()
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
