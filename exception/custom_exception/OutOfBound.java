package exception.custom_exception;

public class OutOfBound extends RuntimeException
{
    OutOfBound(String message)
    {
        super(message);
    }
}
class StrOOB
{
    static void OutOfBound(int[] arr, int index) throws OutOfBound
    {
        if(index >= arr.length || index<0)
        {
            throw new OutOfBound("Array index out of Bound");
        }
        System.out.println("Valid range is from 0 to "+(arr.length-1));
    }

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8};
        try {
           OutOfBound(number, 2);
           //OutOfBound(number, 10);
            System.out.println("Congrats provide valid index");
        }
        catch (OutOfBound ex){
            System.out.println("Your provided index is out of bound: "+ex.getMessage());
        }
    }
}