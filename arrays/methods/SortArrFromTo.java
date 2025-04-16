package arrays.methods;

import java.util.Arrays;

public class SortArrFromTo{
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,6,5,7,4,10,9,11,12,13};
        Arrays.sort(arr,3,10);
        System.out.println(Arrays.toString(arr));
    }
}
