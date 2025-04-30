package java8.stream.terminal_methods;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("aarya");
        li.add("sanjay");
        li.add("jadhav");
        li.add("system");
        li.add("java");
        li.add("okku");
        li.add("aan");

        li.stream().filter(s -> s.startsWith("a"))
                .limit(1)
                .forEach(s -> System.out.println(s));
    }
}
