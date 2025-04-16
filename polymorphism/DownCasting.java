package polymorphism;

//Java Does not support class cast exception it will work at compile time but fail at runtime

public class DownCasting {
    void show(){
        System.out.println("Parent class method downcast");
    }
}
class Downcasting1 extends DownCasting{
    @Override
    void show(){
        System.out.println("child class method downcast");
    }

    public static void main(String[] args) {
        Downcasting1 obj1 =(Downcasting1) new DownCasting();     //ClassCastException occure here
        obj1.show();
    }
}