package map.Methods;

import java.util.HashMap;

public class ContainValKey {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(1,11);
        hmap.put(2,22);
        hmap.put(3,33);
        hmap.put(4,44);

        System.out.println(hmap.containsKey(1));
        System.out.println(hmap.containsValue(44));

        System.out.println(hmap.containsKey(5));
        System.out.println(hmap.containsValue(55));
    }
}
