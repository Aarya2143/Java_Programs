package exception.run_time;

public class NullPointer {
    public static void main(String[] args) {
        String s1 = null;
        try
        {
            System.out.println(s1.length());
        }
        catch (Exception np){
            System.out.println("The string is point to null how we calculate the length "+np.getMessage());
        }
    }
}
