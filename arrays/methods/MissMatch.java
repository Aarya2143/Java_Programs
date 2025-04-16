package arrays.methods;

import java.util.Arrays;

public class MissMatch {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b= {1,2,3,4,5};
        System.out.println(Arrays.mismatch(a,b));
    }
}
