package task;

public class OneMethodToAnotherCall {
    void m1()
    {
     m2();
    }
    void m2()
    {
     m1();
    }

    public static void main(String[] args) {
        OneMethodToAnotherCall obj = new OneMethodToAnotherCall();
        obj.m2();
    }
}
