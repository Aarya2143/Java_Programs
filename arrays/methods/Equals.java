package arrays.methods;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        Object[] arr1={1,2,3,4,5,6};
        Object[] arr2={1,2,3,4,5,6};
        System.out.println(Arrays.equals(arr1,arr2));

        int[] arr3={1,2,3};
        int[] arr4={4,5,6};
        System.out.println(Arrays.equals(arr3,arr4));
    }
}
