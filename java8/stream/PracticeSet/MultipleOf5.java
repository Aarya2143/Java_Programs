package java8.stream.PracticeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOf5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,15);
        List<Integer> result = new ArrayList<>(nums);
        result.removeIf(n -> n%5 != 0);
        System.out.println(result);

        /*List<Integer> mul = nums.stream()
                .filter(n -> n%5 == 0)
                .collect(Collectors.toList());
        System.out.println("Multiple of 5 from the list: "+mul);*/

       /* List<Integer> result = new ArrayList<>();
        for(Integer number : nums){
            if(number % 5 == 0){
                result.add(number);
            }
        }
        System.out.println(result);*/
    }
}
