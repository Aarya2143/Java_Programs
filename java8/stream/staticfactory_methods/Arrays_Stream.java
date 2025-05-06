package java8.stream.staticfactory_methods;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arrays_Stream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(s -> System.out.println(s));
    }
}
