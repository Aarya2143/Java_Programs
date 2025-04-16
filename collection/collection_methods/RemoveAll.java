package collection.collection_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveAll {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple","Banana","kiwi","mango","grapes"));
        Set<String> set2 = new HashSet<>(Arrays.asList("grapes","kiwi"));

        System.out.println("Before removing all: "+set1);

        boolean isRemoved = set1.removeAll(set2);

        System.out.println("After removing set2 from set1: "+set1);
        System.out.println("Were is removed: "+isRemoved);


    /*  ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5));

        System.out.println("Before reoving list1: "+list1);

        boolean isRemoved = list1.removeAll(list2);

        System.out.println("After removing list2 from list1: "+list1);
        System.out.println("Were is removed: "+isRemoved);
    */
    }
}
