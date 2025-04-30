package collection.linkedlist.PracticeProg;

import java.util.LinkedList;
import java.util.List;

public class RemoveMethods {
    public static void main(String[] args) {
        List<String> str = new LinkedList<>();
        str.add(0,"aa");
        str.add(1,"bb");
        str.add(2,"cc");
        str.add(3,"dd");

        str.remove("aa");
        System.out.println(str);

        str.remove(1);
        System.out.println(str);

        str.removeIf(s -> s.startsWith("d"));
        System.out.println(str);

        str.removeAll(str);
        System.out.println(str);
    }
}
