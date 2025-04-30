package collection.arraylist_method;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(1);

        System.out.println(li.contains(2));
        System.out.println(li.contains(6));
    }
}
