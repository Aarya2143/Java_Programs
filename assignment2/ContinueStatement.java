package assignment2;

public class ContinueStatement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0 ; i<a.length; i++)
        {
            if(i % 2 ==0)
            {
                continue;
            }
            System.out.println("Element is odd: "+i);
        }
    }
}
