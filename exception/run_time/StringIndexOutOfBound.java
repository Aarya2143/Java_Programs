package exception.run_time;

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        String s1 = "Aarya";
        try{
            System.out.println(s1.charAt(5));
        }
        catch (StringIndexOutOfBoundsException str)
        {
            System.out.println("Provided index is not present in the string");
        }
    }
}
