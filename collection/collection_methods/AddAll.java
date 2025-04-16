package collection.collection_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddAll {
    public static void main(String[] args) {
    /*  ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple","kiwi"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("mango","banana","apple"));

        System.out.println("Before adding: "+list1);
        boolean isAdding = list1.addAll(list2);
        System.out.println("After adding: "+list1);  */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,3));

        System.out.println("Before adding: "+set1);
        boolean isAdding = set1.addAll(set2);

        System.out.println("After adding: "+set1);
        //  System.out.println("Were adding: "+isAdding);
    }
}
