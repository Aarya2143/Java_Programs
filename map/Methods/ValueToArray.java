package map.Methods;

import java.util.Arrays;
import java.util.HashMap;

public class ValueToArray {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ABC",10);
        map.put("B",20);
        map.put("C",30);

        Integer[] valuearray = map.values().toArray(new Integer[0]);

        System.out.println(Arrays.toString(valuearray));
    }
}
