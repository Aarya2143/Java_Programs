package collection.AL_method;

import java.util.ArrayList;

public class GetIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list.get(2));
        System.out.println(list.get(1));
    }
}
