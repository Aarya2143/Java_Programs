package exception;

public class TryFinally {
    public static void main(String[] args) {
        try{
            String s1 = null;
            System.out.println(s1.indexOf(4));
        }
        finally{
            System.out.println("im finally block");
        }
    }
}
