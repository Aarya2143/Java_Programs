package collection.arraylist_method;

import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("ft");
        obj.add("hu");
        obj.add("jiy");

        List<String> obj1 = new ArrayList<>();
        obj1.addAll(obj);

        System.out.println(obj1);
    }
}
