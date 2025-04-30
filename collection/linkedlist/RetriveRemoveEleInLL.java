package collection.linkedlist;

import java.util.LinkedList;

public class RetriveRemoveEleInLL {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<>();
        li.add("India");
        li.add("Brazil");
        li.add("Canada");
        li.add("Dubai");
        li.add("Korea");

        System.out.println(li);

        Object first = li.peekFirst();
        System.out.println(first);
        System.out.println(li);

        Object last = li.peekLast();
        System.out.println(last);
        System.out.println(li);

        Object firstpool = li.pollFirst();
        System.out.println(firstpool);
        System.out.println(li);

        Object lastpool = li.pollLast();
        System.out.println(lastpool);
        System.out.println(li);
    }
}
