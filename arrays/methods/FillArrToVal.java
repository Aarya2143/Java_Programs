package arrays.methods;

import java.util.Arrays;

public class FillArrToVal {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int val= 50;
        Arrays.fill(arr,1,4,val);
        System.out.println(Arrays.toString(arr));
    }
}
