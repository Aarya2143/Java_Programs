package map.Methods;

import map.Ha;

import java.util.HashMap;

public class Clone {
    public static void main(String[] args) {
        HashMap<String, Integer> s = new HashMap<>();

        s.put("A",1);
        s.put("B",2);
        s.put("C",3);
        s.put("D",4);

        HashMap<String, Integer> s1 = (HashMap<String, Integer>) s.clone();
        s1.put("E",5);


        System.out.println(s);
        System.out.println(s1);
    }
}
