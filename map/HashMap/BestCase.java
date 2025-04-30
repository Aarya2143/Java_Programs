package map.HashMap;

import java.util.HashMap;
import java.util.Map;

//Java HashMap can be the best choice if we want to perform a search operation.
// It is designed to rapidly find things
public class BestCase {
    public static void main(String[] args) {
        Map<String,Long> ph = new HashMap<>();
        ph.put("Aarya",9372111327L);
        ph.put("Pappa",9373701606L);
        ph.put("mummy",8306434722L);
        ph.put("viv",7972444509L);
        ph.put("John", 9431676282L);
        ph.put("Deep", 8292736478L);
        ph.put("Shubh", 8123543268L);
        ph.put("Mark", 9876789142L);

        Long number = ph.get("viv");
        System.out.println(number);

        Long Numner1 = ph.getOrDefault("sarth",0l);
        System.out.println(Numner1);
    }
}
