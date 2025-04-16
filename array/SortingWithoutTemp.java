package array;

public class SortingWithoutTemp {
    public static void main(String[] args) {
        int[] arr = {10,50,78,4,96,48,44};

        for(int i=0; i< arr.length; i++)
        {
            for (int j= i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(" Index is: "+i+ "  Element of: "+arr[i]);
        }
    }
}
