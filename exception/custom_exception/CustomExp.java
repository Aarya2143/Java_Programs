package exception.custom_exception;

public class CustomExp extends Exception
{
    CustomExp(String s){
        super(s);
    }

    public static void main(String[] args) {
        try {
            throw new CustomExp("THIS IS CUSTOM EXCEPTION");
        }
        catch (CustomExp e) {
            System.out.println("caught");
            System.out.println("The exception is: "+e.getMessage());
        }
    }
}
