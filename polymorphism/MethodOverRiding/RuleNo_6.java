package polymorphism.MethodOverRiding;

//RuleNo_6 : We cannot override the static method but, we can re-declare the static method with same signature as parent static method

/*--------------------------------------------- Invalid ------------------------------------------
public class RuleNo_6 {
    static void show()
    {
        System.out.println("Parent show method");
    }
}
class StaticChild{
    @Override
    static void show()
    {
        System.out.println("child class show method");
    }
}
*/

// ---------------------------------------------- Valid ---------------------------------------------
public class RuleNo_6 {
    static void show()
    {
        System.out.println("Parent show method");
    }
}
class StaticChild extends RuleNo_6{
  //  @Override ------------------------------------- remove --------------------------------------------
    static void show()
    {
        System.out.println("child class show method");
    }

    public static void main(String[] args) {
        StaticChild obj99 = new StaticChild();
        show();

        RuleNo_6 obj100 = new RuleNo_6();
        show();
    }
}