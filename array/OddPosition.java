package array;

public class OddPosition {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i=0; i< array.length; i=i+2)
        {
            System.out.println("Element at odd position: "+array[i]);
        }
    }
}
