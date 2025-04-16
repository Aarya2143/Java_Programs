package exception.run_time;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] b = {0,1,2,3,4};       // 0-4
        int[] a = new int [10];      // 0-9
        ArrayIndexOutOfBound obj = new ArrayIndexOutOfBound();
       try
       {
           System.out.println(b[2]);
           // System.out.println(a[10]);
       }
       catch (RuntimeException e)
       {
           System.out.println("This Array index is not present");
       }
       finally {
           System.out.println(10/0);
           System.out.println("10 is execute or not");
       }
    }
}
