package polymorphism;

public class UpCasting {
    void show()
    {
        System.out.println("Parent class method");
    }
}
class Upcasting1 extends UpCasting{
    void show()
    {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        UpCasting obj = new Upcasting1();
        obj.show();
    }
}
