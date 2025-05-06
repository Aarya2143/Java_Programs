package java8.stream.CollectorsMethod;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long no = nums.stream()
                .collect(Collectors.counting());
        System.out.println(no);
    }
}
