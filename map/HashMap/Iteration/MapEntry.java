package map.HashMap.Iteration;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEntry {
    public static void main(String[] args) {
        Map<String,Long> ph = new LinkedHashMap<>();
        ph.put("Aarya",9372111327L);
        ph.put("Pappa",9373701606L);
        ph.put("mummy",8306434722L);
        ph.put("viv",7972444509L);
        ph.put("John", 9431676282L);
        ph.put("Deep", 8292736478L);

        Iterator<Map.Entry<String,Long>> itr = ph.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
