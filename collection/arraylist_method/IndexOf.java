package collection.arraylist_method;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {
    public static void main(String[] args) {
        List<String> LI = new ArrayList<>();
        LI.add("Aa");
        LI.add("Bb");
        LI.add("Cc");

        System.out.println(LI.indexOf("Bb"));
    }
}
