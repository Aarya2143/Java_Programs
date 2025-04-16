package map.Methods;

import java.util.HashMap;

public class Clear {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("s1",11);
        obj.put("s2",12);
        obj.put("s3",13);

        obj.clear();
        System.out.println(obj);
    }
}
