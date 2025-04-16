package exception;

public class Throw {
    public static void main(String[] args)
    {
        try
        {
            String s2 = "java";
            System.out.println(s2.charAt(6));
        }
        catch (StringIndexOutOfBoundsException a)
        {
            throw a;
        }
    }
}
