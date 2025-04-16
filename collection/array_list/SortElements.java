package collection.array_list;

import java.util.ArrayList;
import java.util.Collections;

public class SortElements {
        public static void main(String[] args) {
            ArrayList obj = new ArrayList();
            obj.add("Apple");
            obj.add("kiwi");
            obj.add("mango");
            obj.add("banana");
            obj.add("dates");

            System.out.println("Original: "+obj);

            Collections.sort(obj);

            System.out.println("Sorted: "+obj);
    }
}
