package exception.run_time;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            int c = 10 / 0;
            System.out.println(c);
        }
        catch (ArithmeticException ar){
            System.out.println("Give another no plz 0 is not allow");
        }
    }
}
