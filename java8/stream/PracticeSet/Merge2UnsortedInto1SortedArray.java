package java8.stream.PracticeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Merge2UnsortedInto1SortedArray {
    public static void main(String[] args) {
       int[] a = {2,3,4,1};
       int[] b = {7,6,8,9};

        List<Integer> merge = new ArrayList<>();

        for(Integer s : a){
            merge.add(s);
        }
        for (Integer e : b){
            merge.add(e);
        }
        Collections.sort(merge);
        System.out.println(merge);


       /*int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
               .sorted()
               .toArray();
        System.out.println(Arrays.toString(c));*/

       /* int[] result = Stream.of(a,b)
                .flatMapToInt(Arrays :: stream)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));*/
    }
}
