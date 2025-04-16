package polymorphism.MethodOverRiding;

//RuleNo_4 :Access Modifier level of child class cannot be more restrictive than the parent class method access level

public class RuleNo_4 {
    void add()                                  // more restrive access modifier than child class
    {
        System.out.println("parent method");
    }
}
class child8 extends RuleNo_4{
    @Override
    protected void add()                        // less restrive access modifier than parent class
    {
        System.out.println("child method");
    }

    public static void main(String[] args) {
        RuleNo_4 obj9 = new RuleNo_4();
        obj9.add();

        child8 obj10 = new child8();
        obj10.add();
    }
}
