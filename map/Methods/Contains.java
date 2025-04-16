package map.Methods;

import java.util.HashMap;

public class Contains {
    public static void main(String[] args) {
        HashMap<String, Integer> Onj = new HashMap<>();
        Onj.put("t1",1);
        Onj.put("t2",2);
        Onj.put("t3",3);
        Onj.put("t4",4);

        System.out.println("t1".contains("1"));
        System.out.println("".contains("4"));
    }
}
