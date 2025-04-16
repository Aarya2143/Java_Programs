package exception.run_time;

public class IllegalArgument {
    public static void main(String[] args) {
        try{
            Thread onj = new Thread();
            onj.setPriority(11);   //Priority of each thread is 1 to 10
        }
        catch(IllegalArgumentException il){
            System.out.println("Set Priority 10 or less than 10");
        }
    }
}
