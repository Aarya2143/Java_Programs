package map.Methods;

import java.util.HashMap;

public class Merge {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("ABC",1);
        obj.put("XYZ",2);
        obj.put("GSYG",3);
        obj.put("aaa",4);

        obj.merge("ABC",5,Integer::sum);
        obj.merge("XYZ",2,Integer::sum);

        System.out.println(obj);
    }
}
