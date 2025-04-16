package exception.custom_exception;

public class StringNull extends Exception
{
    StringNull(String s)
    {
        super(s);
    }
}
class newone{
    static void show(String e) throws StringNull
    {
        if(e == null){
            throw new StringNull("String is null");
        }
        System.out.println("String is empty");
    }

    public static void main(String[] args)
    {
        try {
            show(null);
        }
        catch (StringNull sn){
            System.out.println("Your String is invalid");
        }
    }
}