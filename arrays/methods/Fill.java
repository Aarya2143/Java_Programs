package arrays.methods;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        int[] arr = {20,30,40};
        int value = 10;
        Arrays.fill(arr,value);
        System.out.println(Arrays.toString(arr));
    }
}
