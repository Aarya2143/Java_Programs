package exception;

public class PipeOperator {
    public static void main(String[] args) {
        try{
            String st = null;
            System.out.println(st.length());
        }
        catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException ex)
        {
            System.out.println("Exception will occure here : "+ex.getMessage());
        }
    }
}
