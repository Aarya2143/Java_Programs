package collection.collection_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        obj.removeIf(n -> n % 2 == 0);

        System.out.println(obj);
    }
}
