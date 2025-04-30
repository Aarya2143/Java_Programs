package map.Methods;

import java.util.HashMap;
import java.util.Map;

public class PutAll {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Aarya");

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(2,"sanjay");
        map2.put(3,"jadhav");
        map1.putAll(map2);

        System.out.println(map1);
        System.out.println(map2);
    }
}
