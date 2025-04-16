package map.Methods;

import java.util.HashMap;
import java.util.Objects;

public class Replace {
    public static void main(String[] args) {
        HashMap<Object, Object> obj = new HashMap<>();
        obj.put(1,"AA");
        obj.put(2,"BB");
        obj.put(3,"aa");
        obj.put(4,"bb");
        obj.put(5,"cc");

        System.out.println(obj.replace(1,"bb"));
        System.out.println(obj.replace(2,"BB","vv"));
        System.out.println(obj);
    }
}
