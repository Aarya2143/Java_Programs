package arrays.methods;

import java.util.Arrays;

public class CompareUnsigned {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6,7,8};
        int[] b= {1,2,3,4,5};
        int[] c= {1,2,10};
        int[] d= {1,2,9};

        System.out.println(Arrays.compareUnsigned(a,b));
        System.out.println(Arrays.compareUnsigned(a,c));
        System.out.println(Arrays.compareUnsigned(a,d));
        System.out.println(Arrays.compareUnsigned(c,d));
    }
}
