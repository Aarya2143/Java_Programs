package exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            String s1 = null;
            System.out.println(s1.toUpperCase());
            String s2 = null;
            System.out.println(s2.length());
        }
        catch(IllegalArgumentException IL){
            System.out.println("illegal operation");
        }
        catch(NullPointerException ex){
            System.out.println("Not convert into upper class");
        }
        finally {
            System.out.println("im finally block");
        }
    }
}
