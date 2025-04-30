package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13);

        Optional<Integer> minNo = li.stream()
                .min(Integer::compare);

        if(minNo.isPresent()){
            System.out.println("Min No is: "+minNo.get());
        }
    }
}
