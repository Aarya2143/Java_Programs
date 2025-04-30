package map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        Map<String,Integer> obj1 = new HashMap<>();
        obj1.put("Aarya",1);
        obj1.put("Sanjay",2);
        obj1.put("Jadhav",3);
        obj1.put("Aarya",4);
        obj1.put(null,null);
        obj1.put(null,9);

        System.out.println(obj1);
        System.out.println(obj1.get(null));
    }
}
