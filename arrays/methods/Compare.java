package arrays.methods;

//This method is used to compare two arrays passed as parameters lexicographically
//The compare() method returns 0 if the first and second arrays are equal and contain the same elements in the same order.
//If the first array is greater than second array, it returns a value greater than zero.
//If the first array is less than second array, it returns a value less than 0.
import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7,4,5};
        int[] arr3 = {1,2,3,4,5};

        System.out.println(Arrays.compare(arr1,arr2)); //-1  (arr1<arr2)
        System.out.println(Arrays.compare(arr1,arr3)); //0   (arr1=arr2)
        System.out.println(Arrays.compare(arr2,arr3)); //1   (arr2>arr3)
    }
}
