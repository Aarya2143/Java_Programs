package polymorphism.MethodOverRiding;

//RuleNo_3 : Return Type must be same as parent class overriden method

public class RuleNo_3 {
    int add()
    {
        System.out.println("parent");
        return 10+20;
    }
}
class child extends RuleNo_3
{
    @Override
    int add() {
        System.out.println("child");
        return 20+60;
    }

    public static void main(String[] args) {
       child obj = new child();
       obj.add();

       RuleNo_3 obj1 = new RuleNo_3();
       obj1.add();
    }
}
