package exception;

public class FinallyNotExecute {
    void m1(){
        System.out.println("Method 1 start");
        try {
            System.out.println("Im try block");
            System.exit(2);
        }
        finally {
            System.out.println("im finally Block");
        }
    }
    {
        System.out.println("Im instance");
    }
    public static void main(String[] args) {
        FinallyNotExecute obj = new FinallyNotExecute();
        obj.m1();
    }
}
