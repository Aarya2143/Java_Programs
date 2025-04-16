package polymorphism.MethodOverRiding;

//RuleNo_1 : Method can only be overrriden in subclass, not in same class

public class RuleNo_1 {
    void add()
    {
        System.out.println("parent class method");
    }
}
class child1 extends RuleNo_1
{

}
class child2 extends RuleNo_1
{

}
class  child3 extends RuleNo_1 {
    @Override
    void add()
    {
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        child1 obj = new child1();
        obj.add();

        child2 obj1 = new child2();
        obj1.add();

        child3 obj2 = new child3();
        obj2.add();
    }
}