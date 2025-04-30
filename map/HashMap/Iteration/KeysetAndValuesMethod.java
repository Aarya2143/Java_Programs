package map.HashMap.Iteration;

import java.util.HashMap;
import java.util.Map;

public class KeysetAndValuesMethod {
    public static void main(String[] args) {
        Map<String,Integer> ph = new HashMap<>();
        ph.put("Aarya",9372111);
        ph.put("Pappa",93737016);
        ph.put("mummy",830643);
        ph.put("viv",79724);
        ph.put("John", 94316762);
        ph.put("Deep", 8292736);

        for (String s1 : ph.keySet()){
            System.out.println(s1);
        }

        for (Integer s2 : ph.values()){
            System.out.println(s2);
        }
    }
}
