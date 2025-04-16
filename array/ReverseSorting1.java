package array;

public class ReverseSorting1 {

    public static void main(String[] args) {
        int[] a = {3,40,1,2,6,5,7,10,9,58,96};
        for(int i=0 ; i<a.length ; i++)
        {
            for(int j= i+1; j<a.length; j++)
            {
                int temp = 0;
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        for (int i=0 ; i<a.length; i++)
        {
            System.out.println("Index: "+i+ "Element: "+a[i]);
        }
    }
}
