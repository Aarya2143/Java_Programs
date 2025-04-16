package arrays.methods;

import java.util.Arrays;

public class ParallelSortFromTo {
    public static void main(String[] args) {
        String[] a = {"Aarya","Sanjay","Jadhav","Revati","Hindraj"};
        Arrays.parallelSort(a,0,3);
        System.out.println(Arrays.toString(a));
    }
}
