package java8.stream.CollectorsMethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingValues {
    public static void main(String[] args) {
        List<Integer> no = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double avg = no.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println(avg);
    }
}
