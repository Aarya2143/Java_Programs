package map.HashMap;

import java.util.HashMap;

public class GetMethod {
    public static void main(String[] args) {
        HashMap<String, String> obj = new HashMap<>();
        obj.put("A","a");
        obj.put("B","");
        obj.put("C","c");
        obj.put("A","d");
        obj.put(null,"U");
        obj.put("","i");

        System.out.println(obj.get("A"));
        System.out.println(obj.get("B"));
        System.out.println(obj.get("C"));
        System.out.println(obj.get(null));
        System.out.println(obj.get(""));

    }
}
