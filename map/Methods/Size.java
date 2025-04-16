package map.Methods;

import java.util.HashMap;

public class Size {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("test1",1);
        obj.put("test2",2);
        obj.put("test3",3);
        obj.put("test4",4);
        obj.put("test4",5);
        obj.put("",6);

        System.out.println(obj.size());
    }
}
