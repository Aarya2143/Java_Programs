package java8.FunctionInterface;

//Static method can not be overridden.
//No of static method is allowed to write in functional interface.

@FunctionalInterface
interface Add{
    void show();

    static void disp(){
        System.out.println("static method");
    }
}

public class StaticMethod implements Add{

    @Override
    public void show() {
        System.out.println("Abstract show method");
    }

    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.show();
        Add.disp();
    }
}
