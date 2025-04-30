package java8.function_interface;

@FunctionalInterface
public interface DefaultOverloading {
    void add();

    default void a(){
        System.out.println("defult 1");
    }

    default void a(String s){
        System.out.println("default 2");
    }
}
class Dummy implements DefaultOverloading{

    @Override
    public void add() {
        System.out.println("Overriden Abstract");
    }

    @Override
    public void a() {
      //  DefaultOverloading.super.a();
        System.out.println("overriden non para");
    }

    @Override
    public void a(String s) {
        //  DefaultOverloading.super.a(s);
        System.out.println("overriden para");
    }

    public static void main(String[] args) {
        Dummy obj = new Dummy();
        obj.a();
        obj.a("Aarya");
        obj.add();
    }
}
