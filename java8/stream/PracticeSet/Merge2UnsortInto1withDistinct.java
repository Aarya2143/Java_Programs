package java8.stream.PracticeSet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Merge2UnsortInto1withDistinct {
    public static void main(String[] args) {
        int[] a = {4,2,3,1,2};
        int[] b = {6,7,5,8,5};
        Set<Integer> merged = new LinkedHashSet<>();

        for(Integer s : a){
            merged.add(s);
        }
        for(Integer p : b){
            merged.add(p);
        }
        List<Integer> result = new ArrayList<>(merged);
        Collections.sort(result);
        System.out.println(result);

        /*int[] a = {4,2,3,1,2};
        int[] b = {6,7,5,8,5};
        Set<Integer> merged = new HashSet<>();

        for(Integer s : a){
            merged.add(s);
        }
        for(Integer p : b){
            merged.add(p);
        }

          List<Integer> res = merged.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
          System.out.println(res);*/

        /*int[] c = Stream.of(a,b)
                .flatMapToInt(Arrays::stream)
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(c));*/

        /*int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .distinct()
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(c));*/
    }
}
