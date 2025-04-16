package array.sorting;

public class MissingElement2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};

        System.out.println("Length of arr: "+ arr.length);  //9

        for (int i = 0; i < arr.length - 1; i++) //9-1=8
        {
            if (arr[i + 1] - arr[i]   !=   1) //0+1-0=1  1+1-1=1  2+1-2=1  3+1-3=1  4+1-4=2 ---> gap is 2
            {
                System.out.println("Missing number: " + (arr[i] + 1)); // (2+1=3)---> print 3
                break;
            }
        }
    }
}
