package exception.custom_exception;

import exception.Throw;

public class DivideByException extends Exception
{
    DivideByException(String d)
    {
        super(d);
    }
}
class exz
{
    static void divide(int a, int b) throws DivideByException {
        if (b==0){
            throw new DivideByException("Any no cannot divide by 0 ");
        }
        System.out.println("the divide operation: "+a/b);
    }
    public static void main(String[] args) {
        try {
            divide(10,0);
        }
        catch (DivideByException e) {
            System.out.println("Sorry cant divide by 0: "+e.getMessage());
        }
        System.out.println("out of try catch");
    }
}
