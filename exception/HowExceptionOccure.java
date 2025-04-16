package exception;

public class HowExceptionOccure {

    public static void main(String[] args) {
        int a= 10;
        int b = 0;
        int c = a/b;    //here occure exception

        int d = a+b;    //This line not print because exception disturb the flow of program
        System.out.println(c);
    }
}
