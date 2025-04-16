package collection.ALIterationWays;

import java.util.ArrayList;

public class ForLoop {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("d");
        a.add("c");
        a.add("j");

        for(int i=0; i<a.size(); i++){
            String z = a.get(i);
            System.out.println(z);
        }
    }
}
