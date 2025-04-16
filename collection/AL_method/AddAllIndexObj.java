package collection.AL_method;

import java.util.ArrayList;
import java.util.List;

public class AddAllIndexObj {
    public static void main(String[] args) {
        List<String> ob = new ArrayList<>();
        ob.add("ajs");
        ob.add("jde");
        ob.add("njsn");
        ob.add("hweu");

        List<String> obj1 = new ArrayList<>();
        obj1.add("Fies");
        System.out.println(obj1.addAll(1,List.of("jui","jui","ygyy")));
        System.out.println(obj1);
    }
}
