package collection.arraylist_Iteration_ways;

import java.util.ArrayList;

public class WhileLoop {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        int i =0;
        while (i < al.size()){
            String itr = al.get(i);
            System.out.println(itr);
            i++;
        }
    }
}
