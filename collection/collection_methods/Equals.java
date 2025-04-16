package collection.collection_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Equals {
    public static void main(String[] args) {
        /*
      List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
      List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
      List<Integer> list3 = new ArrayList<>(Arrays.asList(4,5,6));

       System.out.println("list1 and 2 equal? :"+list1.equals(list2));    //Orderable
       System.out.println("list2 and 3 equal? :"+list2.equals(list3));
        */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,3,2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3,4,5));

        System.out.println("list1 and 2 equal? :"+set1.equals(set2));     //Unorderable
        System.out.println("list2 and 3 equal? :"+set2.equals(set3));

    }
}
