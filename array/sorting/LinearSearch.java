package array.sorting;

//Best for small and Unsorted arrays -------- O(n) -------Simple but slow


public class LinearSearch {
    public static int search(int[] arr, int target)
    {
        for (int i=0 ; i<arr.length; i++){
            if(arr[i] == target)
            {
                return i; //Return index if found
            }
        }
        return -1; //Return -1
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=20;
        int result = search(arr, target);  //call search method

        if(result != -1){
            System.out.println("element found index: "+result);
        }
        else {
            System.out.println("element not found");
        }
    }
}
