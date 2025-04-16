package collection.AL_method;

import java.util.ArrayList;
import java.util.List;

public class IastIndexOf {
    public static void main(String[] args) {
        List<String> k = new ArrayList<>();
        k.add("nnis");
        k.add("uwji");
        k.add("gsyg");
        k.add("uwji");

        System.out.println(k.lastIndexOf("uwji"));
    }
}
