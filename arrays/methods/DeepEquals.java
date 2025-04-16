package arrays.methods;

import java.util.Arrays;

public class DeepEquals {
    public static void main(String[] args) {
        int[][] a={{2,3,4,5},{6,7}};
        int[][] b={{2,3,4,5},{6,7}};
        System.out.println(Arrays.deepEquals(a,b));  //TRUE

        int[][] arr1={{3,4,5},{9,10}};
        int[][] arr2={{3,6,5},{9,10}};
        System.out.println(Arrays.deepEquals(arr1,arr2));  //FALSE

        Object[] obj1 = {1,2,3};
        Object[] obj2 = {1,2,3};
        System.out.println(Arrays.deepEquals(obj1,obj2));

    }
}
