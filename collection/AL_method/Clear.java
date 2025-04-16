package collection.AL_method;

import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        obj.clear();
        System.out.println(obj);
    }
}
