package map.Methods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutIf {
    public static void main(String[] args) {
        Map<String,Integer> w = new LinkedHashMap<>();
        w.put("Aarya",21);
        w.put("sakshi",15);
        w.put("shraddha",1);

        Map<Integer,String> w1 = new HashMap<>();
        w1.put(30,"vivek");
        w1.putIfAbsent(30,"shlok");
        w1.putIfAbsent(31,"cherry");
        System.out.println(w);
        System.out.println(w1);

    }
}
