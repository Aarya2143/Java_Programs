package wrapper_class;

import java.util.ArrayList;

public class UsingCollection {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList();

        // Autoboxing (int → Integer)
        obj.add(100);
        obj.add(200);

        // Unboxing (Integer → int)
        int value = obj.get(1);

        System.out.println("list: "+obj);
        System.out.println("Unboxing value: "+value);
    }
}
