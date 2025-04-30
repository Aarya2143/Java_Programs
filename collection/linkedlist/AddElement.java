package collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
        List<String> str = new LinkedList<>();
        str.add(0,"aa");
        str.add(1,"bb");
        str.add(2,"cc");
        str.add(3,"dd");

        str.remove(3);

        System.out.println(str);
    }
}
