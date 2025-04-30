package collection.linkedlist;

import java.util.LinkedList;

public class PushPoPMethod {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("India");
        str.add("Brazil");
        str.add("Canada");
        str.add("Dubai");
        str.add("Korea");

        str.push("US");
        System.out.println(str);

        str.pop();
        System.out.println(str);

        str.pop();
        System.out.println(str);
    }
}
