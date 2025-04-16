package exception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        String s1 = "hello java";
        String s3 = "Hello";
        try{
            String s4 = null;
            System.out.println(s4.length());
            char s2 = s1.charAt(20);
            System.out.println("char at 20:"+s2);
        }
        catch(StringIndexOutOfBoundsException s){
            System.out.println("No char present at 20th index");
        }
        catch (NullPointerException n)
        {
            System.out.println("null pointer exception occure here");
        }
    }
}
