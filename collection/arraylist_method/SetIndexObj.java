package collection.arraylist_method;

import java.util.ArrayList;

public class SetIndexObj {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.set(0,1);
        System.out.println(obj);
    }
}
