package collection.linkedlist.IterationWays;

import java.util.LinkedList;
import java.util.List;

public class While {
    public static void main(String[] args) {
        List<String> obj = new LinkedList<>();
        obj.add("ftf");
        obj.add("yuy");
        obj.add("gyf");

        int i =0;
        while(i<obj.size()){
            System.out.println(obj.get(i));
            i++;
        }
    }
}
