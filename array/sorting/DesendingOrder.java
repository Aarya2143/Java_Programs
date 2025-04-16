package array.sorting;

import java.util.Arrays;
import java.util.Collections;

public class DesendingOrder {
    public static void main(String[] args) {
        Character [] ch = {'A','a','B','b','C','c'};
        Arrays.sort(ch, Collections.reverseOrder());
        System.out.println(Arrays.toString(ch));

        /* String [] s2= {"Aa","aA","a","A"};
        Arrays.sort(s2, Collections.reverseOrder());
        System.out.println(Arrays.toString(s2));       */

        /* String [] s ={"az","ab","ay","ax","ac"};
        Arrays.sort(s, Collections.reverseOrder());
        System.out.println(Arrays.toString(s));         */

        /* Integer[] arr = {5,8,6,4,7,9,3,2,5,4,1};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Reverse: "+Arrays.toString(arr));  */
    }
}
