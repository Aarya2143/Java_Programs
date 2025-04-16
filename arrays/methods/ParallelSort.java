package arrays.methods;

import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args) {
        int[] a = {70,5,86,4,2,0,4,69,6};
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));

        String [] b = {"India","Dubai","America","Germany","Uk"};
        Arrays.parallelSort(b);
        System.out.println(Arrays.toString(b));
    }
}
