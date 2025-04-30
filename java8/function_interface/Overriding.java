package java8.function_interface;

//Only one functional interface inherit another when child FI dont have their own abstract method.

@FunctionalInterface
public interface Overriding {
void add();
}

@FunctionalInterface  //------------------ possible
interface Child extends Overriding{

}

//One functional interface cannot inherit another when child FI have their own abstract method.

@FunctionalInterface
interface sub
{
    void div();
}

//@FunctionalInterface  //------------------ Not possible
interface mul extends sub
{
    void d();
}