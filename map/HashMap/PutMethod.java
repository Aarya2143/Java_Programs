package map.HashMap;

import string.string_method.HashCode;

import java.util.HashMap;

public class PutMethod {
    public static void main(String[] args) {
        HashMap<String, Integer> obj  = new HashMap<>();
        obj.put("test1",1);
        obj.put("test2",2);
        obj.put("test3",3);
        obj.put("test4",4);

        System.out.println(obj);

    }
}
