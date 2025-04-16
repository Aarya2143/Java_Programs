package exception.custom_exception;

public class InvalidException extends Exception
{
    InvalidException (String s)
    {
       super(s);
    }
}
class classno2 {
    static void valid(int a) throws InvalidException
    {
        if(a < 18)
        {
          throw new InvalidException("Age above 18 allow only");
        }
        System.out.println("Age is: "+a);
    }

    public static void main(String[] args) {
        try {
            valid(25);
            System.out.println("Welcome to Our Applcation");
        }
        catch (InvalidException e) {
            System.out.println("Ristricted Application : "+e.getMessage());
            System.out.println("Sorry Age is not valid to open Application");
        }

    }
}

