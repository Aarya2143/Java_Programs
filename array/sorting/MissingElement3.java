package array.sorting;

public class MissingElement3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10};
        int n = 10; //Expected numbers from 1 to 10
        boolean[] present = new boolean[n+1]; //
        for (int i=0; i<arr.length; i++)
        {
            present[arr[i]] = true;
        }

        int missing_no = -1;
        for (int i=1 ; i<=n; i++)
        {
            if(!present[i])
            {
              missing_no = i;
              break;
            }
        }

        System.out.println( "missing no is: "+missing_no );

        for (int i=1; i<=n; i++)
        {
            System.out.println("Index is: "+i+ "  Element is present : "+present[i]);
        }
    }
}
