package arrays.methods;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int[] str = {1,2,3,4,5,6,7,8};
        int[] str1 = Arrays.copyOfRange(str,2,7);

        for(int i=0; i<str1.length; i++)
        {
            System.out.println(str1[i]);
        }
    }
}
