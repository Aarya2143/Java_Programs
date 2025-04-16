package arrays.methods;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,8};
        System.out.println("Element at 5th index: "+ Arrays.binarySearch(arr1,5));
        System.out.println("Element at 9th index: "+Arrays.binarySearch(arr1,9));

        char[] arr2 = {'A','B','C','D','E','F','G','H','I'};
        System.out.println("Element at 1nd index: "+Arrays.binarySearch(arr2, 'B'));
        System.out.println("Element at 2th index: "+Arrays.binarySearch(arr2,'C'));

        String[] arr3 = {"aARYA","sANAJY","jADHAV"};
        System.out.println("Element at index1 :"+Arrays.binarySearch(arr3, "aARYA"));

//        Object[] arr4 = {"Aarya",true,12,2.2};   //------------------ Doesnot work on object class cast
//        System.out.println("Element at index2 : "+Arrays.binarySearch(arr4, "Aarya"));
    }
}
