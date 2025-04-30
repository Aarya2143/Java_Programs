package map.HashMap.Iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterator {
    public static void main(String[] args) {
        Map<String,Integer> o = new HashMap<>();
        o.put("Aarya",9372);
        o.put("Pappa",937);
        o.put("mummy",830);
        o.put("viv",79724);
        o.put("John", 94316);
        o.put("Deep", 829);

        Iterator<String> itr = o.keySet().iterator();
        while (itr.hasNext()){
            Object oj = itr.next();
            System.out.println(oj);
        }

        System.out.println( "=====================================");

        Iterator<Integer> itr2 = o.values().iterator();
        while (itr2.hasNext()){
            Object oj3 = itr2.next();
            System.out.println(oj3);
        }

    }
}
