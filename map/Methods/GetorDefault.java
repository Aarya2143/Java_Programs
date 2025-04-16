package map.Methods;

import java.util.HashMap;

public class GetorDefault {
    public static void main(String[] args) {
        HashMap<Integer, Integer> ob = new HashMap<>();
        ob.put(1,11);
        ob.put(2,12);
        ob.put(3,13);
        ob.put(4,14);
        ob.put(5,15);

        //If "1" exists, return its value(11)
        System.out.println(ob.getOrDefault(1,0));

        // "6" does not exist, so return the default value (0)
        System.out.println(ob.getOrDefault(6,0));
    }
}
