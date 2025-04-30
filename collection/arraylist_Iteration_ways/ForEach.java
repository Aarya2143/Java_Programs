package collection.arraylist_Iteration_ways;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> ab = new ArrayList<>();
        ab.add("hgs");
        ab.add("hus");
        ab.add("ujs");
        ab.add("iuyi");

        for(String a : ab){
            System.out.println(a);
        }
    }
}
