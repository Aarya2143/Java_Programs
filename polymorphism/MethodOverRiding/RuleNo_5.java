package polymorphism.MethodOverRiding;

//RuleNo_5 : A method declared final cannot be overriden
/* --------------------------------- Invalid ----------------------------------------------

public class RuleNo_5 {
    final void add()
    {
        System.out.println("add");
    }
}
class childs extends RuleNo_5
{
    @Override
    final void add()
    {
        System.out.println("add");
    }
}

*/

//----------------------------------------- Valid ----------------------------------------

class parent{
    void add(){
        System.out.println("PARENT");
    }
}
class child16{

    final void add()
    {
        System.out.println("child");
    }

    public static void main(String[] args) {
        child16 ob = new child16();
        ob.add();
    }
}