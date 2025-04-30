package java8.stream.terminal_methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Max {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> maxNo = li.stream()
                .max(Integer::compareTo);

        if(maxNo.isPresent()){
            System.out.println("Maximum no in List: "+maxNo.get());
        }
    }
}
