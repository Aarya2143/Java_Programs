package arrays.methods;

import java.util.Arrays;

public class MissMatchFromTo {
    public static void main(String[] args) {
        int[] a = {1,2,3,8,9,7,5,4,10,20};
        int[] b = {1,2,9,57,5,4,3,2};
        System.out.println(Arrays.mismatch(a,0,9,b,0,1));
    }
}
