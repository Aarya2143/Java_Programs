package java8.FunctionInterface;

//Need to give annotation to declare interface as functional interface.
//Need to give Only One abstract method in functional interface.
//In functional interface any no of default as well as static methods.

@FunctionalInterface
public interface FuncInterface1 {
    void add();

    default void a(){
        System.out.println("Default method");
    }

    static void b(){
        System.out.println("static method");
    }
}
 class abc implements FuncInterface1{

     @Override
     public void a() {
         System.out.println("Default method overriden here in FuncInterface1");
     }

     @Override
     public void add() {
         System.out.println("Abstract method overriden here in FuncInterface1");
     }

     public static void main(String[] args) {
         abc o = new abc();
         o.a();
         o.add();
         FuncInterface1.b();
     }

 }

