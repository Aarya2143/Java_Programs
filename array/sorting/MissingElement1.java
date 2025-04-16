package array.sorting;

public class MissingElement1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7 , 8, 9, 10};

        int n = 10; // Total no of expected o/p

        int expectedsum = n * (n+1) / 2;

        int actualsum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            actualsum += arr[i];
        }

//        for(int num : arr)
//        {
//            actualsum += num;
//        }

        int missingNo = expectedsum - actualsum;

        System.out.println("Sum from 1 to "+n+": "+expectedsum);
        System.out.println("Actual sum of array elements: "+actualsum);
        System.out.println("missing no: "+missingNo);
    }
}
