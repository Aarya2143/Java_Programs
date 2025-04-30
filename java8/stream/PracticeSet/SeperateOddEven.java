package java8.stream.PracticeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeperateOddEven {
    public static void main(String[] args) {
        /*List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = numbers.stream()
                .filter(n ->n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> odd = numbers.stream()
                .filter(n -> n%2 != 0)
                .collect(Collectors.toList());

        System.out.println("even numbers: "+even);
        System.out.println("odd numbers: "+odd);*/

        /*List<Integer> numbr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = numbr.stream()
                 .filter(n-> (n & 1) == 0)
                .collect(Collectors.toList());
        System.out.println("Even no: "+even);

        List<Integer> odd = (List<Integer>) numbr.stream()
                .filter(n -> (n & 1) != 0)
                .collect(Collectors.toList());
        System.out.println("Odd no: "+odd);*/

        List<Integer> numbr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(Integer num : numbr){
            if(num % 2 == 0){
                even.add(num);
            }
            else {
                odd.add(num);
            }
        }
        System.out.println("even no is: "+even);
        System.out.println("odd no is: "+odd);
    }
}
