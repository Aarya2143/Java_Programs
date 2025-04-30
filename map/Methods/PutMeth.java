package map.Methods;

import java.util.HashMap;
import java.util.Map;

public class PutMeth {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hu");
        map.put(2,"ha");
        map.put(3, "haaa");
        map.put(4,"hiii");
        map.put(1,"hi");

        System.out.println(map);
    }
}
