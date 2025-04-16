package map.Methods;

import java.util.HashMap;

public class HashCode {
    public static void main(String[] args) {
        HashMap<String , String> ob = new HashMap<>();
        ob.put("FB","A");
        ob.put("Ea","C");

        System.out.println("FB".hashCode());
        System.out.println("Ea".hashCode());
    }
}
