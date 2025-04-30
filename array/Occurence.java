package array;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int i=0; i<arr.length; i++){
            StringBuilder str = new StringBuilder();
            for(int j=i; j<arr.length; j++){
                str.append(arr[j]);
                System.out.println(str);
            }
        }
    }
}
