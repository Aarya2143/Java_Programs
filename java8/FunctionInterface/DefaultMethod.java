package java8.FunctionInterface;

@FunctionalInterface
interface def{
    void show();

    default void add(){
        System.out.println("default method can overriden");
    }
}
public class DefaultMethod implements def{
    @Override
    public void show() {
        System.out.println("Abstract method can override");
    }

    @Override
    public void add() {
       // def.super.add();   //This use to call parent class default method
        System.out.println("Default method also can overriden");
    }

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.show();
        defaultMethod.add();
    }
}
