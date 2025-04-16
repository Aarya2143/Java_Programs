package collection.collection_methods;

import java.util.ArrayList;

public class ToArray {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("array");
        list.add("dresh");
        list.add("gfd5rd");

        Object[] arr = list.toArray();

        for(Object obj : arr)
        {
        System.out.println(obj);
        }
    }
}
