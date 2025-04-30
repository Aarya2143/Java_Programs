package collection.linkedlist.IterationWays;

import java.util.LinkedList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        List<String> obj = new LinkedList<>();
        obj.add("ftf");
        obj.add("yuy");
        obj.add("gyf");

        for(int i=0; i<obj.size(); i++){
            System.out.println("element: "+ obj.get(i));
        }
    }
}
