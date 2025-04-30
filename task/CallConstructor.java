package task;

public class CallConstructor {
    CallConstructor(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        CallConstructor obj = new CallConstructor();
        System.out.println("main method");
    }
}
