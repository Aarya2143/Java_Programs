package exception;

public class ExceptionHandle {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = 10/0;
            System.out.println("print msg");
        }
        catch (ArithmeticException ar)
        {
            System.out.println("exception is occure here");
        }
    }
}
