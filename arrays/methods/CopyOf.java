package arrays.methods;

//It returns an array that is copy of arrayOriginal. newLength represents the length of copy.

import java.util.Arrays;

public class CopyOf {
    public static void main(String[] args) {
        int[] origArr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = Arrays.copyOf(origArr,12);

        for(int i=0; i < newArr.length; i++)
        {
            System.out.println(newArr[i]);
        }
    }
}
