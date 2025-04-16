package map.Methods;

import java.util.Arrays;
import java.util.HashMap;

public class KeysToArray {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ABC",10);
        map.put("B",20);
        map.put("C",30);

        String[] keys = map.keySet().toArray(new String[0]);

        System.out.println(Arrays.toString(keys));
    }
}
