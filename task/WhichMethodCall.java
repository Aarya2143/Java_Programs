package task;

public class WhichMethodCall {
    void show(){
        System.out.println("parent 1");
    }
}
class child extends WhichMethodCall
{
    void disp(){
        System.out.println("child 1");
    }

    public static void main(String[] args) {
        child ref =(child) new WhichMethodCall();
        ref.show();
        ref.disp();
    }
}