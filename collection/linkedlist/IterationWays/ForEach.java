package collection.linkedlist.IterationWays;

import java.util.LinkedList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> obj = new LinkedList<>();
        obj.add("ftf");
        obj.add("yuy");
        obj.add("gyf");

        for(String str : obj){
            System.out.println(str);
        }
    }
}
