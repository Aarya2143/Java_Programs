package exception;

public class Thows {
    public static void main(String[] args) throws NullPointerException, StringIndexOutOfBoundsException
    {
        String s1 = null;
        System.out.println(s1.charAt(5));
    }
}
