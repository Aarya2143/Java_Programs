package map.iteration;

import java.util.*;

public class UsingEntry {
    public static void main(String[] args) {
        Map<String, Long> ph = new HashMap<>();
      //  Map<String, Long> ph = new LinkedHashMap<>();
      //  Map<String, Long> ph = new TreeMap<>();
        ph.put("Aarya",9372111327L);
        ph.put("Pappa",9373701606L);
        ph.put("mummy",8306434722L);
        ph.put("viv",7972444509L);
        ph.put("John", 9431676282L);
        ph.put("Deep", 8292736478L);

        //For Iterate both key as well as values
        Iterator<Map.Entry<String, Long>> itr = ph.entrySet().iterator();
       /* while (itr.hasNext()){
            Object o = itr.next();
            System.out.println(o);
        }*/

        //Iterate keys only
        Iterator<String> itr1 = ph.keySet().iterator();
        /*while (itr1.hasNext()){
            Object o1 = itr1.next();
            System.out.println(o1);
        }*/

        //Iterate values only
        Iterator<Long> itr2 = ph.values().iterator();
        while (itr2.hasNext()){
            Object o2 = itr2.next();
            System.out.println(o2);
        }
    }
}
