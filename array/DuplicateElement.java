package array;

public class DuplicateElement {
    public static void duplicate(int[] array)
    {
        for (int i=0; i< array.length; i++){
            for (int j=i+1; j< array.length; j++ ){
                if(array[i]==array[j]){
                    System.out.println("Duplicate array found: "+array[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,5,4,1,8,5,9,9};
        duplicate(array);
    }
}
