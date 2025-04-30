package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StartsWithAandO {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("aarya");
        li.add("om");
        li.add("vivek");
        li.add("nikhil");
        li.add("oggy");
        li.add("Adit");
        li.add("olly");
        li.add("sheku");
        li.add("ora");
        li.add("aaru");
        li.add("akki");

        li.stream().filter(s -> (s.startsWith("a")||s.startsWith("o")))
                .filter(s -> s.length()<=4)
                .forEach(s -> System.out.println(s));
    }
}
